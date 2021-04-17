package LTM.control;

import java.rmi.Remote;
import java.rmi.RemoteException;

import LTM.model.Student;

public interface IRemoteClient extends Remote {
    public Student getStudent() throws RemoteException;

    public int getMax(int a, int b) throws RemoteException;

    public int getUSCLN(int a, int b) throws RemoteException;

    public int getBSCNN(int a, int b) throws RemoteException;

    public String getReverse(String str) throws RemoteException;

    public String getNormalization(String str) throws RemoteException;
}
