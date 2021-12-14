package KyThuatLapTringHuongDoiTuong.LuyenTap.DoThi;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class DSA09001_ChuyenDSCanhSangDSKe {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int V, E;
        Point[] arr;
        Vector<Integer>[] result;
        while (T-- > 0) {
            V = in.nextInt();
            E = in.nextInt();
            arr = new Point[E];
            result = new Vector[V + 1];
            for (int i = 0; i < E; i++) {
                arr[i] = new Point(
                        in.nextInt(),
                        in.nextInt()
                );
            }
            Arrays.sort(arr, (o1, o2) -> {
                if (o1.x == o2.x) return o1.y - o2.y;
                return o1.x - o2.x;
            });
            for (int i = 0; i <= V; i++) {
                result[i] = new Vector<>();
            }
            for (Point p : arr) {
                result[p.x].add(p.y);
                result[p.y].add(p.x);
            }
            for (int i = 1; i <= V; i++) {
                System.out.print(i + ": ");
                for (int j : result[i]) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }

    private static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
