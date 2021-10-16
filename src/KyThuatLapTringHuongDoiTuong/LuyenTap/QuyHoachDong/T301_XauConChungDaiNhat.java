package KyThuatLapTringHuongDoiTuong.LuyenTap.QuyHoachDong;

import java.util.Scanner;

/*
    https://code.ptit.edu.vn/student/question/T301
 */
public class T301_XauConChungDaiNhat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        String s1, s2;
        while (T-- > 0) {
            s1 = in.nextLine();
            s2 = in.nextLine();
            int[][] f = new int[s1.length() + 1][s2.length() + 1];

            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        f[i + 1][j + 1] = f[i][j] + 1;
                    } else {
                        f[i + 1][j + 1] = Math.max(f[i + 1][j], f[i][j + 1]);
                    }
                }
            }

            System.out.println(f[s1.length()][s2.length()]);
        }
    }
}
