package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class BFSTrenDoThiVoHuong {

    private static Queue<Integer> queue;
    private static Vector<Integer>[] vectors;
    private static int[] isVisited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int V, E, u, v, x, c = 0;

        while (T-- > 0) {
            ++c;
            V = in.nextInt();
            E = in.nextInt();
            x = in.nextInt();

            vectors = new Vector[V + 2];
            isVisited = new int[V + 2];

            for (int i = 1; i <= V + 1; i++) {
                vectors[i] = new Vector<>();
            }

            for (int i = 1; i <= E; i++) {
                u = in.nextInt();
                v = in.nextInt();
                vectors[u].add(v);
                vectors[v].add(u);
            }

            System.out.print("BFS(" + x + ") = ");
            BFS(x);
            System.out.println();
        }
    }
    private static void BFS(int u) {
        queue = new LinkedList<>();
        queue.add(u);
        isVisited[u] = 1;
        int x;
        System.out.print(u);
        while (!queue.isEmpty()) {
            x = queue.poll();
            if (x != u) System.out.print(" -> " + x);
            for (int i : vectors[x]) {
                if (isVisited[i] == 0) {
//                    System.out.print(" -> " + i);
                    isVisited[i] = 1;
                    queue.add(i);
                }
            }
        }
    }
}
