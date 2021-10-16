package KyThuatLapTringHuongDoiTuong.LuyenTap.CoBan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02031_SapXepChon_LietKeNguoc {
    private static ArrayList<String> result;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n + 1];
        int min, temp;
        boolean check = true;
        StringBuilder s;
        result = new ArrayList<>();
        for (int i = 0; i < n; i++) a[i] = in.nextInt();

        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                check = false;
            }
        }

        if (check) {
            System.out.print("Buoc 1: ");
            for (int k = 0; k < n; k++) {
                System.out.print(a[k] + " ");
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                min = i;
                s = new StringBuilder();
                for (int j = i; j < n; j++) {
                    if (a[min] > a[j]) min = j;
                }
                temp = a[min];
                a[min] = a[i];
                a[i] = temp;

                for (int k = 0; k < n; k++) {
                    s.append(a[k]).append(" ");
                }
                result.add("Buoc " + (i + 1) + ": " + s);
            }
            Collections.reverse(result);
            for (String x : result) System.out.println(x);
        }
    }
}
