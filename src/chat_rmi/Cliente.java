
package chat_rmi;

import java.rmi.Naming;


public class Cliente {

    public static void main(String[] args) {
        
        
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 try {
            Chat ch=(Chat) Naming.lookup("//192.168.0.32/Chat");//pilas con la direccion ip de                         
                        
            VentanaChat v =new VentanaChat(ch);
            v.setVisible(true);
            
            
            Thread deamon =new Demonio("demonio0",ch, v);
            deamon.start();
            
        } catch (Exception e) {
        }
                
                                          
            }
        });
        /*
        try {
            Chat ch=(Chat) Naming.lookup("//192.168.0.50/Chat");//pilas con la direccion ip de 
            
        } catch (Exception e) {
        }*/
    }
    
}
