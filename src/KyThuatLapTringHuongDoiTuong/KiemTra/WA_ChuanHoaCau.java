package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.util.Scanner;

public class WA_ChuanHoaCau {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s, t;
        int i = 100;
        while (i-- > 0) {
            s = in.nextLine();
            if (!s.isEmpty() && !s.isBlank()) {
                s = s.toLowerCase().trim().replaceAll(" +", " ");
                t = s.substring(0, 1).toUpperCase() + s.substring(1);
                for (int x = 0; x < t.length(); x++) {
                    if (t.charAt(x) == ' ' && (t.charAt(x + 1) == '.' || t.charAt(x + 1) == '!' || t.charAt(x + 1) == '?')) {

                    } else {
                        System.out.print(t.charAt(x));
                        if (t.charAt(x) == '.' || t.charAt(x) == '!' || t.charAt(x) == '?') {
                            System.out.println();
                        }
                    }
                }

                char c = t.charAt(s.length() - 1);
                if (c != '.' && c != '!' && c != '?') {
                    System.out.print('.');
                    System.out.println();
                }
            }
        }
    }
}
