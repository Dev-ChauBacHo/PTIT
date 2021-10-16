package KyThuatLapTringHuongDoiTuong.LuyenTap.QuyHoachDong;

import java.util.Scanner;

public class T308_ToHopCnk {
    private static int[][] f;
    private static final int MOD = (int) (1e9 + 7);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        f = new int[1001][1001];
        process();
        int n, k;
        while (T-- > 0) {
            n = in.nextInt();
            k = in.nextInt();
            System.out.println(f[n][k]);
        }
    }

    private static void process() {
        // Dung tam giac pascal
        for (int i = 0; i <= 1000; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {
                    f[i][j] = 1;
                } else {
                    f[i][j] = (f[i - 1][j - 1] + f[i - 1][j]) % MOD;
                }
            }
        }
    }
}
