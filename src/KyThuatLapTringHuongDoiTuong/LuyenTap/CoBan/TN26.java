package KyThuatLapTringHuongDoiTuong.LuyenTap.CoBan;

import java.util.Arrays;
import java.util.Scanner;

public class TN26 {
    private static int n, k, s, count;
    private static int[] c;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            c = new int[50];
            n = in.nextInt();
            k = in.nextInt();
            s = in.nextInt();
            if (n == 0 && k == 0 && s == 0) break;
            count = 0;
            backStack(1);
            System.out.println(count);
        }
    }

    private static void backStack(int i) {
        for (int j = c[i - 1] + 1; j <= n - k + i; j++) {
            c[i] = j;
            if (i == k) process();
            else backStack(i + 1);
        }
    }

    private static void process() {
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += c[i];
        }
        if (sum == s) ++count;
    }
}
