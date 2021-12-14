package KyThuatLapTringHuongDoiTuong.LuyenTap.DoThi;

import java.util.*;

public class DSA09005_BFSTrenDoThiVoHuong {

    private static Queue<Integer> queue;
    private static Vector<Integer>[] vectors;
    private static int u, v;
    private static int[] isVisited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int V, E, s;
        while (T-- > 0) {
            V = in.nextInt();
            E = in.nextInt();
            s = in.nextInt();
            vectors = new Vector[V + 1];
            isVisited = new int[V + 1];
            for (int i = 0; i <= V; i++) {
                vectors[i] = new Vector<>();
            }
            for (int i = 1; i <= E; i++) {
                u = in.nextInt();
                v = in.nextInt();
                vectors[u].add(v);
                vectors[v].add(u);
            }
            process(s);
            System.out.println();
        }
    }

    private static void process(int u) {
        queue = new LinkedList<>();
        queue.add(u);
        isVisited[u] = 1;
        int x;
        while (!queue.isEmpty()) {
            x = queue.poll();
            System.out.print(x + " ");
            for (int i : vectors[x]) {
                if (isVisited[i] == 0) {
                    queue.add(i);
                    isVisited[i] = 1;
                }
            }
        }
    }
}
