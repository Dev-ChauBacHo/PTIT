package KyThuatLapTringHuongDoiTuong.LuyenTap.CoBan;

import java.util.Scanner;

public class TN10_HoanViNguoc {
    private static int n;
    private static int[] a;
    private static boolean[] b;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            a = new int[15];
            b = new boolean[15];
            n = in.nextInt();
            backtracking(1);
            System.out.println();
        }
    }

    private static void backtracking(int i) {
        for (int j = n; j >= 1; j--) {
            if (!b[j]) {
                a[i] = j;
                b[j] = true;
                if (i == n) process();
                else backtracking(i + 1);
                b[j] = false;
            }
        }
    }

    private static void process() {
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }
}
