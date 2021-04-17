package LTM.Main;

import java.rmi.RemoteException;

public class Run {
    public static void main(String[] args) throws RemoteException {
        TCP_run tcp = new TCP_run();
        Server_RMI rmi = new Server_RMI();
        rmi.run();
        tcp.run();
    }

}
