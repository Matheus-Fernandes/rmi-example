import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Brasileiro extends UnicastRemoteObject implements Mensageiro{    
    private static final long serialVersionUID = 1L;

    protected Brasileiro() throws RemoteException{
        super();
    }
    
    @Override
    public String mensagem() throws RemoteException {
        return "Olá Mundo";
    }
}