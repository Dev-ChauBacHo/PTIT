package LTM.Main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class TCP_run extends Thread {
    @Override
    public void run() {
        try {
            Socket sk = new Socket("localhost", 11001);
            DataOutputStream dos = new DataOutputStream(sk.getOutputStream());
            DataInputStream dis = new DataInputStream(sk.getInputStream());
            ObjectInputStream ois = new ObjectInputStream(sk.getInputStream());
            dos.writeUTF("B17DCCN693");
            dos.flush();
            dos.writeUTF("Tran Dinh Vinh");
            dos.flush();
            dos.writeUTF("localhost");
            dos.flush();
            dos.writeInt(5);
            dos.flush();
            dos.writeUTF("VINHTRAN");
            dos.flush();
            dos.writeInt(11099);
            dos.flush();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
