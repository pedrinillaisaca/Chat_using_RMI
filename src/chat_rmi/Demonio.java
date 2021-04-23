
package chat_rmi;

import java.rmi.RemoteException;

public class Demonio extends Thread{
    private Chat chat;
    private VentanaChat v;
    private String histLocal="";//historial Local de los chats consultados al servidor
    public Demonio(String nombre, Chat ch, VentanaChat v) {    
        super(nombre);               
        this.chat=ch;
        this.v=v;
        
    }
       
    
    public void run(){
        try {
            while(true){
    
                sleep(1000);                      
                if(chat.verificarHist() != this.histLocal.length()){
                    try {                                           
                    //this.histLocal=chat.Actualizacion();     
                    this.v.setHistotialLocal(chat.Actualizacion());     
                                                          
                     } catch (RemoteException e) {
                    }
                }
                  System.out.println("=============================== ");                
                    System.out.println("=> "+histLocal);
                    System.out.println("=============================== ");   
                             
            }
           
                       
        } catch (Exception e) {
        }
    }

  
}
