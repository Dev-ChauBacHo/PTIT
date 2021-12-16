package KyThuatLapTringHuongDoiTuong.ThiHetMon;

import java.util.Scanner;

public class KyTuThuK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        long N, K;
        while (T-- > 0) {
            N = in.nextLong();
            K = in.nextLong();

            long length = (long) Math.pow(2, N);
            long t = QHD(N, K, length);
            char c = (char) (64 + t);
            System.out.println(c);
        }
    }

    private static long QHD(long N, long K, long length) {
        long mid = length / 2;
        if (K == mid) {
//            System.out.println(K);
            return N;
        }
        if (K < mid) {
            return QHD(N - 1, K, length / 2);
        } else {
            return QHD(N - 1, K - mid, length / 2);
        }
    }
}
