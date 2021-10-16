package KyThuatLapTringHuongDoiTuong.LuyenTap.QuyHoachDong;

import java.util.Scanner;

public class DSAKT110_NhaKhongKeNhau {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int n;
        int[] arr;
        while (T-- > 0) {
            n = in.nextInt();
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(process(arr, n));
        }
    }

    private static int process(int[] a, int n) {
        int[] f = new int[n];
        f[0] = a[0];
        f[1] = Math.max(a[0], a[1]);
        for (int i = 2; i < n; i++) {
            f[i] = Math.max(f[i - 1], f[i - 2] + a[i]);
        }
        return f[n - 1];
    }
}
