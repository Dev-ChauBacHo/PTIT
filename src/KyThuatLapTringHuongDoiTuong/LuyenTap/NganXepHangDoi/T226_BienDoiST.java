package KyThuatLapTringHuongDoiTuong.LuyenTap.NganXepHangDoi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class T226_BienDoiST {
    private static Queue<Point> queue;
    private static int[] isVisited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            process(in.nextInt(), in.nextInt());
        }
    }

    private static void process(int s, int e) {
        if (s == e) {
            System.out.println(0);
            return;
        }
        if (s > e) {
            System.out.println(s - e);
            return;
        }
        int result = 0;
        Point temp;
        queue = new LinkedList<>();
        isVisited = new int[100000];
        queue.add(new Point(s, 0));
        while (!queue.isEmpty()) {
            temp = queue.poll();
            if (temp.value * 2 == e || temp.value - 1 == e) {
                if (result != 0) {
                    result = Math.min(result, temp.count + 1);
                } else {
                    result = temp.count + 1;
                }
                System.out.println(result);
                break;
            }
            if (temp.value < e && isVisited[temp.value * 2] == 0) {
                queue.add(new Point(temp.value * 2, temp.count + 1));
                isVisited[temp.value * 2] = 1;
//                System.out.print(temp.value * 2 + " ");
            }
            if (temp.value > 1) {
                if (temp.value > e) {
                    result += temp.count + temp.value - e;
                } else if (isVisited[temp.value - 1] == 0) {
                    queue.add(new Point(temp.value - 1, temp.count + 1));
                    isVisited[temp.value - 1] = 1;
//                System.out.print(temp.value - 1);
                }
            }
//            System.out.println();
        }
    }

    private static class Point {
        int value, count;

        public Point(int value, int count) {
            this.value = value;
            this.count = count;
        }
    }
}
