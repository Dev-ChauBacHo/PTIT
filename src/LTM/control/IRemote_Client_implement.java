package LTM.control;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import LTM.model.Student;


public class IRemote_Client_implement extends UnicastRemoteObject implements IRemoteClient, Serializable {
    public IRemote_Client_implement() throws RemoteException {

    }

    @Override
    public Student getStudent() throws RemoteException {
        // TODO Auto-generated method stub
//        return new Student(5, "B17DCCN693", "Tran Dinh Vinh", "IP", "BTH42020", 1992);
        return new Student();
    }

    @Override
    public int getMax(int a, int b) throws RemoteException {
        // TODO Auto-generated method stub
        return Math.max(a, b);
    }

    @Override
    public int getUSCLN(int a, int b) throws RemoteException {
        if (b == 0) return a;
        return getUSCLN(b, a % b);
    }

    @Override
    public int getBSCNN(int a, int b) throws RemoteException {
        // TODO Auto-generated method stub
        return (a * b) / getUSCLN(a, b);
    }

    @Override
    public String getReverse(String str) throws RemoteException {
        // TODO Auto-generated method stub
        return new StringBuffer(str).
                reverse().toString();

    }

    @Override
    public String getNormalization(String str) throws RemoteException {
        // TODO Auto-generated method stub
        String[] s1 = str.trim().split("\\s+");
        StringBuilder re = new StringBuilder();
        for (String s2 : s1) {
            re.append(s2.replaceFirst(s2.charAt(0) + "", (s2.charAt(0) + "").toUpperCase())).append(" ");
        }
        return re.toString().trim();
    }


}
