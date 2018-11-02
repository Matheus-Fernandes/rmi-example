import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry; 
    
public class CalculatorServer  
{ 
    CalculatorServer() 
    { 
        try
        { 
            System.setProperty("java.rmi.server.hostname", "192.168.0.104");
            LocateRegistry.createRegistry(1099);
            Calculator c = new CalculatorImple(); 
            Naming.rebind("CalculatorService", (Remote)c); 
        }  
        catch (Exception e)  
        { 
            e.printStackTrace(); 
        } 
    } 
    public static void main(String[] args)  
    { 
        new CalculatorServer(); 
    } 
}  