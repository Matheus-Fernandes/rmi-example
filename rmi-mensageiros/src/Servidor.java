import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.Remote;

public class Servidor {
    Servidor(){
        try{
            System.setProperty("java.rmi.server.hostname", "localhost");
            LocateRegistry.createRegistry(1099);

            Naming.rebind("brasileiro", (Remote)(new Brasileiro()));
            Naming.rebind("americano", (Remote)(new Americano()));

            System.out.println("SERVIDOR INICIADO ...\n");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String args[]){
        new Servidor();
    }
}