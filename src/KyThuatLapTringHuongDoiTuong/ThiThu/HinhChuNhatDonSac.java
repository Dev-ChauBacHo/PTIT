package KyThuatLapTringHuongDoiTuong.ThiThu;

import java.util.Scanner;

public class HinhChuNhatDonSac {

    private static long[] arr;
    private static long result;
    private static int M, N;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        M = in.nextInt();
        N = in.nextInt();
        arr = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = in.nextLong();
        }
//        System.out.println(Arrays.toString(arr));
        result = -1;

        process(1, N);
        System.out.println(result);
    }

    private static void process(int x, int y) {
        if (x == y) {
            if (result < arr[x]) result = arr[x];
            return;
        }
        int min = findMin(x, y);
        long temp = arr[min] * (y - x + 1);
        if (temp > result) result = temp;

        if (min - 1 > x) process(x, min - 1);
        if (min + 1 < y) process(min + 1, y);
    }

    private static int findMin(int x, int y) {
        int min = x;
//        for (int i = x; i <= y; i++) {
//            if (arr[i] <= arr[min]) min = i;
//        }

        for (int i = x; i <= (y + x) / 2; i++) {
            if (arr[i] <= arr[min]) min = i;
            if (arr[y - i + 1] <= arr[min]) min = y - i + 1;
        }
        System.out.println(x + ":" + y + ": " + min);
        return min;
    }
}
