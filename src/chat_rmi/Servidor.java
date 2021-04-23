package chat_rmi;

import java.rmi.Remote;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

public class Servidor {

    public static void main(String[] args) {
        try {
            Registry r= java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("Chat", (Remote) new Rmi()  );
            JOptionPane.showMessageDialog(null, "Run Servidor");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Algo susedio con el server "+ e.getMessage() );
            
        }                                   
        
    }
    
}
