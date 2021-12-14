package KyThuatLapTringHuongDoiTuong.LuyenTap.DoThi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class S308_MangXaHoiHoanHao {

    private static Queue<Integer> queue;
    private static Vector<Integer>[] vectors;
    private static int[] isVisited;
    private static int count;
    private static boolean isExist;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int N, M, u, v;
        boolean check;
        while (T-- > 0) {
            N = in.nextInt();
            M = in.nextInt();
            vectors = new Vector[N + 1];
            isVisited = new int[N + 1];
            check = true;

            for (int i = 0; i <= N; i++) {
                vectors[i] = new Vector<>();
            }

            for (int i = 1; i <= M; i++) {
                u = in.nextInt();
                v = in.nextInt();
                vectors[u].add(v);
                vectors[v].add(u);
            }

            for (int i = 1; i <= N; i++) {
                count = 0;
                isVisited[i] = 1;
                if (vectors[i].size() == 0) {
                    isExist = true;
                } else {
                    isExist = false;
                    DFS(i, i);
                }
                System.out.println(i + ": " + isExist);
                if (!isExist) {
                    check = false;
                }
                isVisited = new int[N + 1];
            }

            if (check) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static void DFS(int u, int v) {
        for (int i : vectors[u]) {
            if (isVisited[i] == 0) {
                isVisited[i] = 1;
                ++count;
                DFS(i, v);
                --count;
                isVisited[i] = 0;
            } else {
                if (count == 1 && i == v) {
                    isExist = true;
                } else if (count == 2 && i == v) {
                    isExist = true;
                } else if (count == 3) {
                    isExist = (i == v);
                }
            }
        }
    }

    private static void process(int u, int v) {
        queue = new LinkedList<>();
        queue.add(u);
        int x;
        while (!queue.isEmpty()) {
            x = queue.poll();

        }
    }
}
