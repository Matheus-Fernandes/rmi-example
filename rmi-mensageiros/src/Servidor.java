import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.Remote;

public class Servidor {
    Servidor(){
        try{
            System.setProperty("java.rmi.server.hostname", "192.168.0.104");
            LocateRegistry.createRegistry(1099);

            Naming.rebind("Brasileiro", (Remote)(new Brasileiro()));
            Naming.rebind("Americano", (Remote)(new Americano()));            
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String args[]){
        new Servidor();
    }
}