package KyThuatLapTringHuongDoiTuong.LuyenTap.CoBan;

import java.util.Scanner;

public class TN17_DoiChoCacChuSo_WA {
    private static char[] s;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int k, max;
        while (T-- > 0) {
            k = Integer.parseInt(in.next());
            s = in.next().toCharArray();
            int start = 0;
            while (k > 0 && start < s.length) {
//                System.out.println(start);
                max = start;
                for (int i = start; i < s.length; i++) {
                    if (s[i] > s[max]) {
                        max = i;
                    }
                }
//                System.out.print(max);
                if (s[start] != s[max]) {
//                    System.out.println(" " + s[start]);
                    char t = s[start];
                    s[start] = s[max];
                    s[max] = t;
                    --k;
                }
                ++start;
//                System.out.println(Arrays.toString(s));
            }

            for (char c : s) System.out.print(c);
            System.out.println();
        }
    }
}
