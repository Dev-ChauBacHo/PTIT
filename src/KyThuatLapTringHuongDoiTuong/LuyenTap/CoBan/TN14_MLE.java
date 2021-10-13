package KyThuatLapTringHuongDoiTuong.LuyenTap.CoBan;

import java.util.PriorityQueue;
import java.util.Scanner;

public class TN14_MLE {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long MOD = 1000000007;
        int T = in.nextInt();
        int N;
        long first, second, sum;
        while (T-- > 0) {
            N = in.nextInt();
            sum = 0;
            PriorityQueue<Long> ropes = new PriorityQueue<>();
            for (int i = 0; i < N; i++) ropes.add(in.nextLong());
            while (!ropes.isEmpty()) {
                first = ropes.poll();
                if (!ropes.isEmpty()) {
                    second = ropes.poll();
                    first = (first + second) % MOD;
                    if (!ropes.isEmpty()) ropes.add(first);
                }
                sum = (sum + first) % MOD;
            }
            System.out.println(sum);
        }
    }
}
