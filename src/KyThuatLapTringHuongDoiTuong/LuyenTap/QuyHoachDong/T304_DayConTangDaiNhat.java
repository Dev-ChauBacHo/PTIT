package KyThuatLapTringHuongDoiTuong.LuyenTap.QuyHoachDong;

/*
    https://code.ptit.edu.vn/student/question/T304
 */

import java.util.Scanner;

public class T304_DayConTangDaiNhat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] arr = new long[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLong();
        }
        long[] f = new long[n + 1];

        for (int i = 0; i < n; i++) {
            f[i] = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] > arr[j]) {
                    f[i] = Math.max(f[i], f[j] + 1);
                }
            }
        }

        long result = 0;
        for (long i : f) result = Math.max(result, i);
        System.out.println(result);
    }
}
