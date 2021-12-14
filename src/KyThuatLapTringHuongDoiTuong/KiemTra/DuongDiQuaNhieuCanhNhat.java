package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class DuongDiQuaNhieuCanhNhat {


    private static Vector<Integer>[] vectors;
    private static int[][] isVisited;
    private static Stack<Integer> stack;
    private static int count, max;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int V, E, u, v, x;

        while (T-- > 0) {
            V = in.nextInt();
            E = in.nextInt();

            vectors = new Vector[V + 2];
            isVisited = new int[V + 2][V + 2];

            for (int i = 0; i <= V + 1; i++) {
                vectors[i] = new Vector<>();
            }

            for (int i = 1; i <= E; i++) {
                u = in.nextInt();
                v = in.nextInt();
                vectors[u].add(v);
                vectors[v].add(u);
            }

            max = -1;
            for (int i = 0; i < V; i++) {
                count = 0;
                isVisited = new int[V + 2][V + 2];
                DFS(i);
            }
            System.out.println(max);
        }
    }

    private static void DFS(int u) {
        for (int i : vectors[u]) {
            if (isVisited[u][i] == 0 && isVisited[i][u] == 0) {
                isVisited[u][i] = 1;
                isVisited[i][u] = 1;
                ++count;
                DFS(i);
                if (count > max) max = count;
                isVisited[u][i] = 0;
                isVisited[i][u] = 0;
                --count;
            }
        }
    }
}
