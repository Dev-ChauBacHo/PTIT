package KyThuatLapTringHuongDoiTuong.LuyenTap.QuyHoachDong;

import java.util.Scanner;

public class T314_CaiTui {
    private static int[][] f;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int n, v;
        int[] A, C;
        while (T-- > 0) {
            n = in.nextInt();
            v = in.nextInt();
            A = new int[n + 1];
            C = new int[n + 1];
            f = new int[n + 1][v + 1];

            for (int i = 0; i < n; i++) A[i] = in.nextInt();
            for (int j = 0; j < n; j++) C[j] = in.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= v; j++) {
                    f[i][j] = f[i - 1][j];
                    if (j >= A[i]) {
                        f[i][j] = Math.max(f[i][j], f[i - 1][j - A[i]] + C[i]);
                    }
                }
            }
            System.out.println(f[n][v]);
        }
    }


}
