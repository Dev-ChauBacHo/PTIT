package KyThuatLapTringHuongDoiTuong.LuyenTap.CoBan;

import java.util.Scanner;

public class T205 {
    private static int n;
    private static int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            n = in.nextInt();
            int k = in.nextInt();
            System.out.println(process(k));
        }
    }

    private static long process(int k) {
        if (k == 0) return 1;
        int x = k / 2;
        long temp = process(x);
        if (k % 2 == 0) return temp * temp % MOD;
        else return (temp * temp % MOD) * n % MOD;
    }
}
