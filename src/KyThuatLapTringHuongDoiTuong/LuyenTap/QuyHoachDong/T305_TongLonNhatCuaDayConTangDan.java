package KyThuatLapTringHuongDoiTuong.LuyenTap.QuyHoachDong;

import java.util.Scanner;

public class T305_TongLonNhatCuaDayConTangDan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int n;
        int[] arr, f;
        while (T-- > 0) {
            n = in.nextInt();
            arr = new int[n + 1];
            f = new int[n + 1];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            for (int i = 0; i < n; i++) {
                f[i] = arr[i];
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[i] > arr[j]) {
                        f[i] = Math.max(f[i], arr[i] + f[j]);
                    }
                }
            }

            int result = 0;
            for (int i : f) result = Math.max(i, result);
            System.out.println(result);
        }
    }
}
