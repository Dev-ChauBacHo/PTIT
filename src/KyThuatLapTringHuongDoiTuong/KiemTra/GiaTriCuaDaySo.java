package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.util.LinkedList;
import java.util.Scanner;

public class GiaTriCuaDaySo {
    private static int n = 0;
    private static int[] arr;
    private static Numer[] results;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n + 1];
        results = new Numer[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        process();
    }

    private static void process() {
        long sum = 0;
        int index;
        for (int i = 0; i < n; i++) {
            results[i] = new Numer(i, arr[i], arr[i]);
        }
        for (int x = n; x > 0; x--) {
            for (int i = 0; i < x; i++) {
                sum += results[i].max - results[i].min;
                index = results[i].index + 1;
                if (index < n) {
                    ++results[i].index;
                    results[i].max = Math.max(arr[index], results[i].max);
                    results[i].min = Math.min(arr[index], results[i].min);
                }
            }
        }
        System.out.println(sum);
    }

    private static class Numer {
        int index, max, min;

        public Numer(int index, int max, int min) {
            this.index = index;
            this.max = max;
            this.min = min;
        }
    }
}
