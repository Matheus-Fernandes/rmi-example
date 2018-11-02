import java.rmi.Naming; 
public class CalculatorClient  
{ 
    public static void main(String[] args)  
    { 
        try
        { 
            Calculator c = (Calculator) Naming.lookup("rmi://192.168.0.104:1099/CalculatorService"); 
            System.out.println("Adicao : "+ c.add(20, 15)); 
        }  
        catch (Exception e)  
        { 
            System.out.println(e); 
        } 
    } 
}