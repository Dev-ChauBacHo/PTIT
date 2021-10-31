package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class DayConTangDan {
    private static int[] a, b, temp;
    private static int n;
    private static ArrayList<String> result;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n];
        b = new int[n];
        result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        if (n == 1) {
            System.out.println(a[0]);
        } else {

            backTracking(0);

            result.sort(Comparator.comparingInt(o -> Integer.parseInt(o.charAt(0) + "")));

            for (String s : result) {
                System.out.println(s);
            }
        }
    }

    private static void backTracking(int i) {
        for (int j = 0; j <= 1; j++) {
            b[i] = j;
            if (i == n - 1) {
                process();
            } else {
                backTracking(i + 1);
            }
        }
    }

    private static void process() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (b[i] == 1) {
                ++count;
            }
        }
        if (count < 2) return;
        temp = new int[count];
        int x = -1;
        for (int i = 0; i < n; i++) {
            if (b[i] == 1) {
                temp[++x] = a[i];
            }
        }

        for (int i = 0; i < count - 1; i++) {
            if (temp[i] >= temp[i + 1]) {
                return;
            }
        }
        StringBuilder t = new StringBuilder();
        for (int i = 0; i < count; i++) {
            t.append(temp[i]).append(" ");
        }
        result.add(t.toString());
    }
}
