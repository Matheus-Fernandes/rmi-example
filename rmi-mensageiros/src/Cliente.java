import java.rmi.Naming;

public class Cliente{
    public static void main(String args[]){
        try{
            Mensageiro m = (Mensageiro)Naming.lookup("rmi://192.168.0.104/Americano");
            System.out.println(m.mensagem());
        }
        catch(Exception e){
            e.printStackTrace();
        }            
    }
}