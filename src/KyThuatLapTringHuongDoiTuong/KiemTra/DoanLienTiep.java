package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.util.Scanner;

public class DoanLienTiep {
    private static int n;
    private static int[] arr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        while (T-- > 0) {
            n = in.nextInt();
            arr = new int[n + 1];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            process();
            System.out.println();
        }
    }

    private static void process() {
        int count;
        for (int i = 0; i < n; i++) {
            count = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) ++count;
            }
            System.out.print(count + " ");
        }
    }
}
