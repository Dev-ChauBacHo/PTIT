package KyThuatLapTringHuongDoiTuong.LuyenTap.DoThi;

import java.util.Scanner;
import java.util.Vector;

public class DSA09004_DFSTrenDoThiVoHuong {
    private static Vector<Integer>[] vectors;
    private static int[] isVisited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int V, E, u, v, s;
        while (T-- > 0) {
            V = in.nextInt();
            E = in.nextInt();
            s = in.nextInt();
            isVisited = new int[V + 1];
            vectors = new Vector[V + 1];
            for (int i = 0; i <= V; i++) {
                vectors[i] = new Vector<>();
            }
            for (int i = 1; i <= E; i++) {
                u = in.nextInt();
                v = in.nextInt();
                vectors[u].add(v);
                vectors[v].add(u);
            }
//            for (int i = 1; i <= V; i++) {
//                System.out.println(vectors[i]);
//            }
            isVisited[s] = 1;
            DFS(s);
            System.out.println();
        }
    }

    private static boolean DFS(int u) {
        System.out.print(u + " ");
        for (int i : vectors[u]) {
            if (isVisited[i] == 0) {
                isVisited[i] = 1;
                DFS(i);
//                isVisited[i] = 0;
            }
        }
        return false;
    }
}
