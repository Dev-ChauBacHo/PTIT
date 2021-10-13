package KyThuatLapTringHuongDoiTuong.LuyenTap.CoBan;

import java.util.Scanner;

public class T206 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            long n = in.nextLong();
            long k = in.nextLong();
            long length = (long) (Math.pow(2, n - 1));
            System.out.println(process(n, k, length));
        }
    }

    private static long process(long n, long k, long mid) {
        if (k == mid) return n;
        if (k > mid) return process(n - 1, k - mid, mid / 2);
        else return process(n - 1, k, mid / 2);
    }
}
