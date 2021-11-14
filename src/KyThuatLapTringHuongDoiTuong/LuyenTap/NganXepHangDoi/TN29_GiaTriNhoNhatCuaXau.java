package KyThuatLapTringHuongDoiTuong.LuyenTap.NganXepHangDoi;

import java.util.PriorityQueue;
import java.util.Scanner;

public class TN29_GiaTriNhoNhatCuaXau {
    private static long[] counts;
    private static PriorityQueue<Long> frequent;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        int k;
        String s;
        while (T-- > 0) {
            k = Integer.parseInt(in.nextLine());
            s = in.nextLine();
            process(k, s);
        }
    }

    private static void process(int k, String s) {
        long temp;
        long result = 0;
        counts = new long[27];
        frequent = new PriorityQueue<>((o1, o2) -> -Long.compare(o1, o2));
        for (char c : s.toCharArray()) {
            ++counts[c - 65];
        }
//        System.out.println(Arrays.toString(counts));
        for (long i : counts) {
            if (i > 0) frequent.add(i);
        }
        while (!frequent.isEmpty() && k > 0) {
            temp = frequent.poll();
//            System.out.println(temp);
            if (temp > 0) {
                --temp;
                frequent.add(temp);
            }
            --k;
        }
        for (long i : frequent) {
//            System.out.println(i);
            result += i * i;
        }
        System.out.println(result);
    }
}
