package KyThuatLapTringHuongDoiTuong.LuyenTap.QuyHoachDong;

import java.util.Scanner;

public class T307_ConEch {
    private static long[] f;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        f = new long[51];
        process();
        int T = in.nextInt();
        int n;
        while (T-- > 0) {
            n = in.nextInt();
            System.out.println(f[n]);
        }
    }

    private static void process() {
        f[0] = 0;
        f[1] = 1;
        f[2] = 2;
        f[3] = 4;
        for (int i = 4; i < 51; i++) f[i] = f[i-1] + f[i-2] + f[i-3];
    }
}
