import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Mensageiro extends Remote {

    String mensagem() throws RemoteException;
}

