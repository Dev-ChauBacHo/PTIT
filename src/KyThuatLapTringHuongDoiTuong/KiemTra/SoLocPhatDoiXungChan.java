package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SoLocPhatDoiXungChan {
    private static Queue<String> queue = new LinkedList<>();
    private static ArrayList<String> results = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int n;
        init();
        while (T-- > 0) {
            n = in.nextInt();
            process(n);
            System.out.println();
        }
    }

    private static void init() {
        queue.add("6");
        queue.add("8");
        results.add("6");
        results.add("8");
        StringBuilder s;
        String x = "";
        while (results.size() <= 10000) {
            x = queue.poll();
            s = new StringBuilder(x).append("6");
            queue.add(s.toString());
            results.add(s.toString());

            s = new StringBuilder(x).append("8");
            queue.add(s.toString());
            results.add(s.toString());
        }
    }

    private static void process(int n) {
        String s;
        for (int i = 0; i < n; i++) {
            s = results.get(i);
            System.out.print(s + reverse(s) + " ");
        }
    }

    private static String reverse(String s) {
        StringBuilder x = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            x.append(s.charAt(i));
        }
        return x.toString();
    }
}
