package KyThuatLapTringHuongDoiTuong.LuyenTap.QuyHoachDong;

import java.util.Scanner;

public class DSA05002_DayConLapLaiDaiNhat {
    private static int[][] f;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int n;
        String s;
        while (T-- > 0) {
            n = in.nextInt();
            s = in.next();
            f = new int[n + 1][n + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j<= n; j++) {
                    if (s.charAt(i-1) == s.charAt(j-1) && i != j) {
                        f[i][j] = f[i-1][j-1] + 1;
                    } else {
                        f[i][j] = Math.max(f[i-1][j], f[i][j-1]);
                    }
                }
            }
            System.out.println(f[n][n]);
        }
    }
}
