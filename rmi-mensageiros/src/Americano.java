import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Americano extends UnicastRemoteObject implements Mensageiro{    
    private static final long serialVersionUID = 1L;

    protected Americano() throws RemoteException{
        super();
    }
    
    @Override
    public String mensagem() throws RemoteException {
        return "Hello World";
    }
}