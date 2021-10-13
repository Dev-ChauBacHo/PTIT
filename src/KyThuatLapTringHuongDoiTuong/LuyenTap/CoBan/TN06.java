package KyThuatLapTringHuongDoiTuong.LuyenTap.CoBan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TN06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T, j = 0;
        String s;
        T = in.nextInt();
        in.nextLine();
        ArrayList<String> result = new ArrayList<>();
        HashMap<String, Integer> index = new HashMap<>();
        while (T-- > 0) {
            s = in.nextLine();
            s = s.toLowerCase().trim().replaceAll(" +", " ");
            String[] list = s.split(" ");
            StringBuilder email = new StringBuilder(list[list.length - 1]);
            for (int i = 0; i < list.length - 1; i++) {
                email.append(list[i].charAt(0));
            }
            int newIndex = index.getOrDefault(email.toString(), 0) + 1;
            index.put(email.toString(), newIndex);
            email.append(newIndex);
            result.add(email.toString());
            ++j;
        }
        for (String name : result) {
            if (name.charAt(name.length() - 1) == '1') {
                System.out.print(name.substring(0, name.length() - 1));
            } else {
                System.out.print(name);
            }
            System.out.println("@ptit.edu.vn");
        }
    }
}
