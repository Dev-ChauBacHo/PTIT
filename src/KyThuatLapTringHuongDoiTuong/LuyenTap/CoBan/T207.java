package KyThuatLapTringHuongDoiTuong.LuyenTap.CoBan;

import java.util.Scanner;

public class T207 {
    static long f[] = new long[100];

    public static void main(String[] args) {
        fibo();
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int n = in.nextInt();
            long k = in.nextLong();
            System.out.println(fiboWork(n, k));
        }
    }

    private static void fibo() {
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= 92; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
    }

    private static char fiboWork(int n, long k) {
        if (n == 1) return 'A';
        if (n == 2) return 'B';
        if (k <= f[n - 2]) return fiboWork(n - 2, k);
        return fiboWork(n - 1, k - f[n - 2]);
    }
}
