package KyThuatLapTringHuongDoiTuong.LuyenTap.CoBan;

import java.util.Scanner;

public class TN04 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int T;
        String s;
        T = in.nextInt();
        in.nextLine();
        while (T-- > 0) {
            s = in.nextLine();
            char[] chars = s.toCharArray();
            int length = chars.length;
            boolean check = true;
            for (int i = 0; i <= length / 2; i++) {
                if (chars[i] != chars[length - i - 1]
                        || Integer.parseInt(String.valueOf(chars[i])) % 2 != 0
                        || Integer.parseInt(String.valueOf(chars[length - i - 1])) % 2 != 0) {
                    check = false;
                    break;
                }
            }
            if (check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
