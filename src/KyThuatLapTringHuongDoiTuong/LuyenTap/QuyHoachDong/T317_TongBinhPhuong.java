package KyThuatLapTringHuongDoiTuong.LuyenTap.QuyHoachDong;

import java.util.Scanner;

public class T317_TongBinhPhuong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int n;
        while (T-- > 0) {
            n = in.nextInt();
            System.out.println(process(n));
        }
    }

    private static int process(int n) {
        int[] f = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            f[i] = i;
            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (j * j <= i) {
                    f[i] = Math.min(f[i], f[i - j * j] + 1);
//                }
            }
        }
        return f[n];
    }
}
