
package chat_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Chat extends Remote{
    
    public String Envio_mensaje(String texto) throws RemoteException;
    
    public int verificarHist() throws RemoteException;
    
    public String Actualizacion () throws RemoteException;
    
    
}
