package KyThuatLapTringHuongDoiTuong.LuyenTap.DoThi;

import java.util.Scanner;
import java.util.Vector;

public class DSA09018_LietKeDinhTru {

    private static Vector<Integer>[] vectors;
    private static int[] isVisited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int V, E;
        int u, v;
        int T = in.nextInt();
        int count, origin;
        while (T-- > 0) {
            V = in.nextInt();
            E = in.nextInt();
            vectors = new Vector[V + 5];
            for (int i = 0; i <= V; i++) {
                vectors[i] = new Vector<>();
            }
            for (int i = 1; i <= E; i++) {
                u = in.nextInt();
                v = in.nextInt();
                vectors[u].add(v);
                vectors[v].add(u);
            }

            isVisited = new int[V + 5];
            origin = 0;
            for (int j = 1; j <= V; j++) {
                if (isVisited[j] == 0) {
                    ++origin;
                    isVisited[j] = 1;
                    DFS(j);
                }
            }

            isVisited = new int[V + 5];
            for (int i = 1; i <= V; i++) {
                isVisited[i] = 1;
                count = 0;
                for (int j = 1; j <= V; j++) {
                    if (isVisited[j] == 0) {
                        ++count;
                        isVisited[j] = 1;
                        DFS(j);
                    }
                }
                isVisited = new int[V + 5];
                if (count != origin) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
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
