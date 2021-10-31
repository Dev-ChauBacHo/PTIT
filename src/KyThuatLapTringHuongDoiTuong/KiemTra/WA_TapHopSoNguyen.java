package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WA_TapHopSoNguyen {
    private static ArrayList<Integer> a;
    private static ArrayList<Integer> b;
    private static ArrayList<Integer> result;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        a = new ArrayList<>();
        b = new ArrayList<>();
        result = new ArrayList<>();
        a.add(-1);
        b.add(-1);
        for (int i = 0; i < n; i++) {
            a.add(in.nextInt());
        }

        for (int i = 0; i < m; i++) {
            b.add(in.nextInt());
        }

        Collections.sort(a);
        Collections.sort(b);

        giao(n, m);
        ASubB(n);
        BSubA(m);
    }

    private static void giao(int n, int m) {
        int i = 1, j = 1;
        while (i <= n && j <= m) {
            if (a.get(i) > b.get(j)) {
                ++j;
            } else if (a.get(i) < b.get(j)) {
                ++i;
            } else {
                if (!result.contains(a.get(i)) && ! result.contains(b.get(j))) {
                    result.add(a.get(i));
                }
                ++i;
                ++j;
            }
        }
        for (int k: result) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    private static void ASubB(int n) {
        for (int i = 1; i <= n; i++) {
            if (!result.contains(a.get(i)) && a.get(i) != a.get(i-1)) {
                System.out.print(a.get(i) + " ");
            }
        }
        System.out.println();
    }

    private static void BSubA(int m) {
        for (int i = 1; i <= m; i++) {
            if (!result.contains(b.get(i)) && b.get(i) != b.get(i-1)) {
                System.out.print(b.get(i) + " ");
            }
        }
        System.out.println();
    }
}
