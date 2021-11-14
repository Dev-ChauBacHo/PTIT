package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.util.*;

public class So2UuThe {
    private static Queue<String> queue;
    private static ArrayList<String> results;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        results = new ArrayList<>();
        queue = new LinkedList<>();
        init();
        while (T-- > 0) {
            process(in.nextInt());
            System.out.println();
        }
    }

    private static void init() {
        queue.add("1");
        queue.add("2");
        String s;
        while (results.size() <= 1000 && !queue.isEmpty()) {
            s = queue.poll();
            if (isOK(s)) results.add(s);
            queue.add(s + "0");
            queue.add(s + "1");
            queue.add(s + "2");
        }
    }

    private static boolean isOK(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '2') ++count;
        }
        return count > s.length() /2;
    }

    private static void process(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(results.get(i) + " ");
        }
    }
}
