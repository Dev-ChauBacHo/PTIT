package KyThuatLapTringHuongDoiTuong.LuyenTap.QuyHoachDong;

import java.util.Scanner;

public class T309_BacThang {
    private static final int MOD = (int) (1e9 + 7);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int n, k;
        while (T-- > 0) {
            n = in.nextInt();
            k = in.nextInt();
            System.out.println(process(n, k));
        }
    }

    private static int process(int n, int k) {
        int[] f = new int[n + 1];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= Math.min(i, k); j++) {
                f[i] = (f[i] + f[i - j]) % MOD;
            }
        }
        return f[n];
    }
}
