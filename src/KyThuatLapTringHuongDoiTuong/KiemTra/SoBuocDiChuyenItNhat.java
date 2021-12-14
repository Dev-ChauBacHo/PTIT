package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SoBuocDiChuyenItNhat {
    private static int n, m;
    private static int[][] matrix;
    private static int[][] isVisited;
    private static Queue<Point> queue;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            n = in.nextInt();
            m = in.nextInt();
            matrix = new int[n + 1][m + 1];
            isVisited = new int[n + 1][m + 1];
            queue = new LinkedList<>();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    matrix[i][j] = in.nextInt();
                }
            }
//            System.out.println("fdsf");
            process();
        }
    }

    private static void process() {
        queue.add(new Point(1, 1, 0));
        isVisited[1][1] = 1;
        Point p;
        int x, y, step;
        int t;
        while (!queue.isEmpty()) {
            p = queue.poll();
//            System.out.println(p);
            step = p.step + 1;

            x = p.x;
            y = p.y;
            if (x < n) {
                t = matrix[x][y] - matrix[x + 1][y];
                if (t < 0) t *= -1;
                x += t;
                if (x == n && y == m) {
                    System.out.println(step);
                    break;
                }
                if (x <= n && isVisited[x][y] == 0) {
                    queue.add(new Point(x, y, step));
                    isVisited[x][y] = 1;
                }
            }

            x = p.x;
            y = p.y;
            if (y < m) {
                t = matrix[x][y] - matrix[x][y + 1];
                if (t < 0) t *= -1;
                y += t;
                if (x == n && y == m) {
                    System.out.println(step);
                    break;
                }
                if (y <= m && isVisited[x][y] == 0) {
                    queue.add(new Point(x, y, step));
                    isVisited[x][y] = 1;
                }
            }

            x = p.x;
            y = p.y;
            if (x < n && y < m) {
                int xx = matrix[x][y] - matrix[x + 1][y + 1];
                int yy = matrix[x][y] - matrix[x + 1][y + 1];
                if (xx < 0) xx *= -1;
                if (yy < 0) yy *= -1;
                x += xx;
                y += yy;
                if (x == n && y == m) {
                    System.out.println(step);
                    break;
                }
                if (x <= n && y <= m && isVisited[x][y] == 0) {
                    queue.add(new Point(x, y, step));
                    isVisited[x][y] = 1;
                }
            }
        }
    }

    private static class Point {
        int x, y, step;

        public Point(int x, int y, int step) {
            this.x = x;
            this.y = y;
            this.step = step;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    ", step=" + step +
                    '}';
        }
    }
}
