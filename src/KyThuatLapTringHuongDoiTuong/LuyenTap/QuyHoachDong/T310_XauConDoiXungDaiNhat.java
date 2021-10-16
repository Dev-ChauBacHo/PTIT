package KyThuatLapTringHuongDoiTuong.LuyenTap.QuyHoachDong;

import java.util.Scanner;

public class T310_XauConDoiXungDaiNhat {
    private static boolean[][] f;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            char[] s = in.next().toCharArray();
            System.out.println(process(s));
        }
    }

    private static int process(char[] s) {
        int j, result = 1;
        int n = s.length;
        f = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j) f[i][j] = true;
                else f[i][j] = false;
            }
        }
        for (int k = 1; k < n; k++) {
            for (int i = 0; i < n - k; i++) {
                j = i + k;
                if (s[i] == s[j]) {
                    if (k == 1) f[i][j] = true;
                    else f[i][j] = f[i+1][j-1];
                }
                if (f[i][j]) result = Math.max(result, j - i + 1);
            }
        }
        return result;
    }
}
