import java.rmi.Naming;

public class Cliente{
    public static void main(String args[]){
        try{
            Mensageiro americano = (Mensageiro)Naming.lookup("rmi://localhost/americano");
            Mensageiro brasileiro = (Mensageiro)Naming.lookup("rmi://localhost/brasileiro");

            System.out.println("Americano: " + americano.mensagem());
            System.out.println("Brasileiro: " + brasileiro.mensagem() + "\n");

        }
        catch(Exception e){
            e.printStackTrace();
        }            
    }
}