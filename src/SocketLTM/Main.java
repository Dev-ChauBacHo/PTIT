package SocketLTM;

import SocketLTM.model.Answer;
import SocketLTM.model.Student;

import java.io.*;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        Socket socket = null;
        ObjectInputStream objectInputStream = null;
        ObjectOutputStream objectOutputStream = null;
        Student student = new Student("B17DCCN693", "TDV", "1.2.3.4", 5);

        try {
            socket = new Socket("192.168.0.107", 11050);
            objectInputStream = new ObjectInputStream(new DataInputStream(socket.getInputStream()));
            objectOutputStream = new ObjectOutputStream(new DataOutputStream(socket.getOutputStream()));
            objectOutputStream.writeObject(student);
            Answer answer = (Answer) objectInputStream.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
                objectInputStream.close();
                objectOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
