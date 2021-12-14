package KyThuatLapTringHuongDoiTuong.LuyenTap.DoThi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class TN06005_QuayLaiDinh1 {

    private static Queue<Integer> queue;
    private static Vector<Integer>[] vectors;
    private static int[] track;
    private static int[] isVisited;
    private static int V, E;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int x;
        int[] count;
        while (T-- > 0) {
            V = in.nextInt();
            E = in.nextInt();
            vectors = new Vector[V + 1];
            count = new int[V + 1];
            for (int i = 0; i <= V; i++) {
                vectors[i] = new Vector<>();
            }
            for (int i = 1; i <= E; i++) {
                vectors[in.nextInt()].add(in.nextInt());
            }

            track = new int[V + 1];
            isVisited = new int[V + 1];
            BFS(1, 2);
            x = 2;
            count[1] = 1;
            while (x != 1) {
                count[x] = 1;
                x = track[x];
            }

            track = new int[V + 1];
            isVisited = new int[V + 1];
            BFS(2, 1);
            x = 1;
            count[2] = 1;
            while (x != 2) {
                count[x] = 1;
                x = track[x];
            }

            int result = 0;
            for (int i = 1; i <= V; i++) {
                if (count[i] == 1) ++result;
            }
            System.out.println(result);
        }
    }

    private static void BFS(int u, int v) {
        queue = new LinkedList<>();
        queue.add(u);
        isVisited[u] = 1;
        int x;
        while (!queue.isEmpty()) {
            x = queue.poll();
            if (x == v) {
                break;
            }
            for (int i : vectors[x]) {
                if (isVisited[i] == 0) {
                    queue.add(i);
                    track[i] = x;
                    isVisited[i] = 1;
                }
            }
        }
    }

}
