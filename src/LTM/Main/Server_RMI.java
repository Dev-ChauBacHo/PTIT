package LTM.Main;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


import LTM.control.IRemoteClient;
import LTM.control.IRemote_Client_implement;

import java.rmi.RemoteException;

public class Server_RMI {
    public void run() throws RemoteException {
        try {
            //khoi tao doi tuong c
            LocateRegistry.createRegistry(11099);
            IRemoteClient f = new IRemote_Client_implement();
            //dang ki voi may ao java
            String url = "rmi://localhost:11099/VINHTRAN";
            Naming.rebind(url, f);
            System.out.println("server RMI ready....");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
