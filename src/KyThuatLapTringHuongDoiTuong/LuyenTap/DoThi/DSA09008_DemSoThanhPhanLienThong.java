package KyThuatLapTringHuongDoiTuong.LuyenTap.DoThi;

import java.util.Scanner;
import java.util.Vector;

public class DSA09008_DemSoThanhPhanLienThong {

    private static Vector<Integer>[] vectors;
    private static int[] isVisited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int V, E;
        int u, v, count;
        while (T-- > 0) {
            V = in.nextInt();
            E = in.nextInt();
            vectors = new Vector[V + 2];
            isVisited = new int[V + 2];
            for (int i = 0; i <= V + 1; i++) {
                vectors[i] = new Vector<>();
            }
            for (int i = 1; i <= E; i++) {
                u = in.nextInt();
                v = in.nextInt();
                vectors[u].add(v);
                vectors[v].add(u);
            }
            count = 0;
            for (int j = 1; j <= V; j++) {
                if (isVisited[j] == 0) {
                    ++count;
                    isVisited[j] = 1;
                    DFS(j);
                }
            }
            System.out.println(count);
        }
    }

    private static void DFS(int u) {
        for (int i : vectors[u]) {
            if (isVisited[i] == 0) {
                isVisited[i] = 1;
                DFS(i);
            }
        }
    }
}
