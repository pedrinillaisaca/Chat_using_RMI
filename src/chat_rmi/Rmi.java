
 
package chat_rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Rmi extends UnicastRemoteObject implements Chat{
    
    private  String historial;

    public Rmi() throws RemoteException{
        this.historial="";
    }

    @Override
    public String Envio_mensaje(String texto) throws RemoteException {
        this.historial=historial+texto+"\n";
        return "OK";
    }

    @Override
    public int verificarHist() throws RemoteException {
       return this.historial.length();
    }

    @Override
    public String Actualizacion() throws RemoteException {
        return this.historial;
    }

   
    
}
