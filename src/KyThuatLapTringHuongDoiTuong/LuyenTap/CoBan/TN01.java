package KyThuatLapTringHuongDoiTuong.LuyenTap.CoBan;

import java.util.Scanner;

public class TN01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T;
        int n;
        long[] f = new long[100];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= 92; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        T = in.nextInt();
        while (T-- > 0) {
            n = in.nextInt();
            System.out.println(f[n]);
        }
    }
}
