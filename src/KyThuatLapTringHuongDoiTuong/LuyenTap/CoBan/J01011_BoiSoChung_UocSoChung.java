package KyThuatLapTringHuongDoiTuong.LuyenTap.CoBan;

import java.util.Scanner;

public class J01011_BoiSoChung_UocSoChung {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T;
        long a, b;
        T = in.nextInt();
        while (T-- > 0) {
            a = in.nextLong();
            b = in.nextLong();
            long gcd = GCD(a, b);
            System.out.println(a * b / gcd + " " + gcd);
        }
    }

    private static long GCD(long a, long b) {
        if (a == 0 || b == 0) return a + b;
        while (a != b) {
            if (a > b) a -= b;
            else b -= a;
        }
        return a;
    }
}
