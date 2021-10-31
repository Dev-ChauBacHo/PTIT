package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        TreeSet<String> list1 = new TreeSet<>();
        TreeSet<String> list2 = new TreeSet<>();
        for (String x : s.toLowerCase().split(" ")) {
            list1.add(x);
        }
        s = in.nextLine();
        for (String x : s.toLowerCase().split(" ")) {
            list2.add(x);
        }
        TreeSet<String> hop = new TreeSet<>();
        hop.addAll(list1);
        hop.addAll(list2);
        for (String x : hop) {
            System.out.print(x + " ");
        }
        System.out.println();
        TreeSet<String> giao = new TreeSet<>();
        for (String x : hop) {
            if (list1.contains(x) && list2.contains(x)) {
                giao.add(x);
            }
        }
        for (String x : giao) {
            System.out.print(x + " ");
        }

    }
}
