package KyThuatLapTringHuongDoiTuong.LuyenTap.CoBan;

import java.util.Scanner;

public class TN13_SapXepCongViec_QuickSort {
    private static int[] a, b;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int n, result;
        while (T-- > 0) {
            n = in.nextInt();
            a = new int[n + 1];
            b = new int[n + 1];
            result = 1;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                b[i] = in.nextInt();
            }
            quickSort(b, 0, n - 1);
            int j = 0;
            for (int i = 1; i < n; i++) {
                if (a[i] >= b[j]) {
                    ++result;
                    j = i;
                }
            }
            System.out.println(result);
        }
    }

    private static void quickSort(int[] a, int i, int j) {
        if (i < j) {
            int pivot = partition(a, i, j);
            quickSort(a, i, pivot - 1);
            quickSort(a, pivot + 1, j);
        }
    }

    private static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                ++i;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return i + 1;
    }

    private static void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

        temp = b[i];
        b[i] = b[j];
        b[j] = temp;
    }
}
