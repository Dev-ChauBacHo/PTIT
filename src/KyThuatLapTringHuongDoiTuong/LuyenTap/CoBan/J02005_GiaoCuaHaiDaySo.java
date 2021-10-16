package KyThuatLapTringHuongDoiTuong.LuyenTap.CoBan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02005_GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        a.add(-1);
        b.add(-1);
        for (int i = 1; i <= n; i++) a.add(in.nextInt());
        for (int i = 1; i <= m; i++) b.add(in.nextInt());

        Collections.sort(a);
        Collections.sort(b);
        int i = 1, j = 1;
        while (i <= n && j <= m) {
            if (a.get(i) > b.get(j)) {
                ++j;
            } else if (a.get(i) < b.get(j)) {
                ++i;
            } else {
                if (!result.contains(a.get(i)) && !result.contains(b.get(j))) {
                    result.add(a.get(i));
                }
                ++i;
                ++j;
            }
        }
        for (int k : result) {
            System.out.print(k + " ");
        }
    }
}
