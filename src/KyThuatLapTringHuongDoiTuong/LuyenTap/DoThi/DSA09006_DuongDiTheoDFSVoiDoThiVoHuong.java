package KyThuatLapTringHuongDoiTuong.LuyenTap.DoThi;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class DSA09006_DuongDiTheoDFSVoiDoThiVoHuong {
    private static Vector<Integer>[] vectors;
    private static int[] isVisited;
    private static int[] track;
    private static Stack<Integer> results;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int V, E, u, v, x, y;
        while (T-- > 0) {
            V = in.nextInt();
            E = in.nextInt();
            x = in.nextInt();
            y = in.nextInt();
            isVisited = new int[V + 1];
            vectors = new Vector[V + 1];
            track = new int[V + 1];
            results = new Stack<>();

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

            isVisited[x] = 1;
            DFS(x, y);
            if (track[y] == 0) {
                System.out.println(-1);
            } else {
                int n = y;
                results.add(n);
                while (n != x) {
                    n = track[n];
                    results.add(n);
                }
                while (!results.isEmpty()) {
                    System.out.print(results.pop() + " ");
                }
                System.out.println();
            }
        }
    }

    private static void DFS(int u, int v) {
        if (u == v) {
            return;
        }
        for (int i : vectors[u]) {
            if (isVisited[i] == 0) {
                isVisited[i] = 1;
                track[i] = u;
                DFS(i, v);
            }
        }
    }
}
