package KyThuatLapTringHuongDoiTuong.LuyenTap.CoBan;

import java.util.Scanner;

public class TN21 {
    private static int n, count;
    private static int[] a;
    private static boolean[] b, xuoi, nguoc;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            count = 0;
            a = new int[11];
            b = new boolean[11];
            xuoi = new boolean[21];
            nguoc = new boolean[21];
            n = in.nextInt();
            backtracking(1);
            System.out.println(count);
        }
    }

    private static void backtracking(int i) {
        for (int j = 1; j <= n; j++) {
            if (!b[j] && !xuoi[i - j + n] && !nguoc[i + j - 1]) {
                a[i] = j;
                b[j] = true;
                xuoi[i - j + n] = true;
                nguoc[i + j - 1] = true;
                if (i == n) ++count;
                else backtracking(i + 1);
                b[j] = false;
                xuoi[i - j + n] = false;
                nguoc[i + j - 1] = false;
            }
        }
    }
}
