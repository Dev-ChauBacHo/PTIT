package KyThuatLapTringHuongDoiTuong.LuyenTap.CoBan;

import java.math.BigInteger;
import java.util.Scanner;

public class J03011 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a;
        BigInteger b;
        int T = in.nextInt();
        while (T-- > 0) {
            a = in.nextBigInteger();
            b = in.nextBigInteger();
            System.out.println(a.gcd(b));
        }
    }
}
