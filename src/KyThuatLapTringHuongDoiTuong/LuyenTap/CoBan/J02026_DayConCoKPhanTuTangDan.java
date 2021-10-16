package KyThuatLapTringHuongDoiTuong.LuyenTap.CoBan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J02026_DayConCoKPhanTuTangDan {
    private static int[] a;
    private static int[] b;
    private static int n, k;
    private static ArrayList<String> result;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            n = in.nextInt();
            k = in.nextInt();
            a = new int[n];
            b = new int[n];
            result = new ArrayList<>();
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            Arrays.sort(a);
//            binary();
            backtracking(0);
            for (int i = result.size() - 1; i >= 0; i--) {
                System.out.println(result.get(i));
            }
        }
    }

    private static void backtracking(int i) {
        for (int j = 0; j <= 1; j++) {
            b[i] = j;
            if (i == n - 1) {
//                System.out.println(Arrays.toString(b));
                process();
            } else
                backtracking(i + 1);
        }
    }

    private static void process() {
        int count = 0;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (b[i] == 1) {
                ++count;
            }
            if (count > k) return;
        }
        if (count == k) {
            for (int i = 0; i < n; i++) {
                if (b[i] == 1) {
                    s.append(a[i]).append(" ");
                }
            }
            result.add(s.toString());
        }
    }
}
