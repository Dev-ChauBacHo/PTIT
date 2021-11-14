package KyThuatLapTringHuongDoiTuong.LuyenTap.NganXepHangDoi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class T227_BienDoiSoNguyenTo {
    private static boolean[] isPrime;
    private static Queue<Point> queue;
    private static int[] isVisited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        isPrime = new boolean[10000];
        init();
//        sangNguyenTo();
        while (T-- > 0) {
            process(in.nextInt(), in.nextInt());
        }
    }

    static void sangNguyenTo() {
        for (int i = 1; i <= 9999; i++) {
            isPrime[i] = true;
        }
        isPrime[1] = false;
        for (int i = 2; i <= 9999; i++) {
            if (isPrime[i]) {
                for (int j = 2; j <= 5000; j++) {
                    if (i * j < 10000) {
                        isPrime[i * j] = false;
                    } else
                        break;
                }
            }
        }
    }

    private static void init() {
        for (int i = 1000; i < 10000; i++) {
            isPrime[i] = prime(i);
        }
    }

    private static boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private static void process(int s, int e) {
        if (s == e) {
            System.out.println(0);
        }
        queue = new LinkedList<>();
        isVisited = new int[10000];
        isVisited[s] = 1;
        Point temp = new Point(s, 0);
        queue.add(temp);
        int thuong, du, t, x;
        while (!queue.isEmpty()) {
            temp = queue.poll();
//            System.out.println(temp.value);
            x = 1;
            while (x <= 1000) {
                thuong = temp.value / (10 * x);
                du = temp.value % x;
//                System.out.println(x + ": " + du);
                for (int i = 0; i < 10; i++) {
                    t = thuong * (10 * x) + (x * i) + du;
//                    System.out.print(t + ": ");
                    if (t > 999 && isPrime[t] && isVisited[t] == 0) {
//                        System.out.print("<--");
                        if (t == e) {
                            System.out.println(temp.count + 1);
                            return;
                        }
                        queue.add(new Point(t, temp.count + 1));
                        isVisited[t] = 1;
                    }
//                    System.out.println();
                }
                x *= 10;
            }

        }
//        while (temp.value != e && !queue.isEmpty());
//        System.out.println(temp.count);
    }

    private static class Point {
        int value, count;

        public Point(int value, int count) {
            this.value = value;
            this.count = count;
        }
    }
}
