package KyThuatLapTringHuongDoiTuong.LuyenTap.NganXepHangDoi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class T230_DiChuyenTranhVatCan {
    private static char[][] arr;
    private static Queue<Point> queue;
    private static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T;
        String s;
        T = Integer.parseInt(in.nextLine());
        Point start, end;
        while (T-- > 0) {
            n = Integer.parseInt(in.nextLine());
            arr = new char[n][n];
            queue = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                s = in.nextLine();
                for (int j = 0; j < s.length(); j++) {
                    arr[i][j] = s.charAt(j);
//                    System.out.print(s.charAt(j));
                }
            }

            start = new Point(in.nextInt(), in.nextInt());
            end = new Point(in.nextInt(), in.nextInt());
            in.nextLine();
            BFS(start, end);
        }
    }

    private static void BFS(Point start, Point end) {
        if (start.equal(end)) System.out.println(1);
        queue.add(start);
        Point p, temp;
        int x, y, step;
        while (!queue.isEmpty()) {
            p = queue.poll();
//            System.out.println(p);
            step = p.steps;

            x = p.x - 1;
            y = p.y;
            while (x >= 0 && arr[x][y] == '.') {
                temp = new Point(x, y, step + 1);
//                System.out.print("--" + temp);
                arr[x][y] = 'X';
                if (temp.equal(end)) {
                    System.out.println(step + 1);
                    return;
                }
                queue.add(temp);
                --x;
            }
//            System.out.println();

            x = p.x + 1;
            y = p.y;
            while (x < n && arr[x][y] == '.') {
                temp = new Point(x, y, step + 1);
//                System.out.print("--" + temp);
                arr[x][y] = 'X';
                if (temp.equal(end)) {
                    System.out.println(step + 1);
                    return;
                }
                queue.add(temp);
                ++x;
            }
//            System.out.println();

            x = p.x;
            y = p.y - 1;
            while (y >= 0 && arr[x][y] == '.') {
                temp = new Point(x, y, step + 1);
//                System.out.print("--" + temp);
                arr[x][y] = 'X';
                if (temp.equal(end)) {
                    System.out.println(step + 1);
                    return;
                }
                queue.add(temp);
                --y;
            }
//            System.out.println();

            x = p.x;
            y = p.y + 1;
            while (y < n && arr[x][y] == '.') {
                temp = new Point(x, y, step + 1);
//                System.out.print("--" + temp);
                arr[x][y] = 'X';
                if (temp.equal(end)) {
                    System.out.println(step + 1);
                    return;
                }
                queue.add(temp);
                ++y;
            }
//            System.out.println();
        }
    }

    private static class Point {
        int x, y;
        int steps = 0;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point(int x, int y, int steps) {
            this.x = x;
            this.y = y;
            this.steps = steps;
        }


        public boolean equal(Point p) {
            return x == p.x && y == p.y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    ", steps=" + steps +
                    '}';
        }
    }
}
