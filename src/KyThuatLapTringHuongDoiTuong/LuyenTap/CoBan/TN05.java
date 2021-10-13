package KyThuatLapTringHuongDoiTuong.LuyenTap.CoBan;

import java.util.Scanner;

public class TN05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T;
        String s;
        T = in.nextInt();
        in.nextLine();
        while (T-- > 0) {
            s = in.nextLine();
            s = s.toLowerCase().trim().replaceAll(" +", " ");
            String[] list = s.split(" ");
            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i].substring(0, 1).toUpperCase() + list[i].substring(1) + " ");
            }
            System.out.println();
        }
    }
}
