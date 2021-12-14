package KyThuatLapTringHuongDoiTuong.LuyenTap.DoThi;

import java.util.Scanner;
import java.util.Vector;

public class TN06004_DinhThat {

    private static Vector<Integer>[] vectors;
    private static int[] isVisited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int V, E;
        int u, v;
        while (T-- > 0) {
            V = in.nextInt();
            E = in.nextInt();
            u = in.nextInt();
            v = in.nextInt();
            vectors = new Vector[V + 1];
            for (int i = 0; i <= V; i++) {
                vectors[i] = new Vector<>();
            }
            for (int i = 1; i <= E; i++) {
                vectors[in.nextInt()].add(in.nextInt());
            }
            int count = 0;
            isVisited = new int[V + 1];
            for (int i = 1; i <= V; i++) {
                if (i != u && i != v) {
                    isVisited[i] = 1;
                    if (!DFS(u, v)) ++count;
                    isVisited = new int[V + 1];
                }
            }
            System.out.println(count);
        }
    }

    private static boolean DFS(int u, int v) {
        if (u == v) return true;
        for (int i : vectors[u]) {
            if (isVisited[i] == 0) {
                isVisited[i] = 1;
                if (DFS(i, v)) return true;
                isVisited[i] = 0;
            }
        }
        return false;
    }
}
