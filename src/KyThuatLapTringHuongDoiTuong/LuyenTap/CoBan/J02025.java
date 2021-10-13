package KyThuatLapTringHuongDoiTuong.LuyenTap.CoBan;

import java.util.Arrays;
import java.util.Scanner;

public class J02025 {
    static int[] b;
    static int n;
    static int[] a;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            b = new int[20];
            a = new int[20];
            n = in.nextInt();
            int[] x = new int[n];
            for (int i = 0; i < n; i++) x[i] = in.nextInt();
            Arrays.sort(x);
            for (int i = 1; i <= n; i++) {
                a[i] = x[n - i];
            }
            backstack(1);
        }
    }

    private static void backstack(int i) {
        for (int j = 0; j <= 1; j++) {
            b[i] = j;
            if (i == n) process();
            else backstack(i + 1);
        }
    }

    private static void process() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (b[i] == 1) sum += a[i];
        }
        if (nguyenTo(sum)) {
            for (int i = 1; i <= n; i++) {
                if (b[i] == 1) {
                    System.out.print(a[i] + " ");
                }
            }
            System.out.println();
        }
    }

    private static boolean nguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
