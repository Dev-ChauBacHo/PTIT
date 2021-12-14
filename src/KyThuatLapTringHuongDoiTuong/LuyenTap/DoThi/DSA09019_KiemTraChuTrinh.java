package KyThuatLapTringHuongDoiTuong.LuyenTap.DoThi;

import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class DSA09019_KiemTraChuTrinh {

    private static Vector<Integer>[] vector;
    private static Queue<Integer> queue;
    private static int[] isVisited;
    private static int[] track;
    private static boolean isExist;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int V, E, u, v;
        while (T-- > 0) {
            V = in.nextInt();
            E = in.nextInt();
            vector = new Vector[V + 5];
            isVisited = new int[V + 5];
            track = new int[V + 5];
            isExist = false;
            for (int i = 0; i < V + 5; i++) {
                vector[i] = new Vector<>();
            }
            for (int i = 1; i <= E; i++) {
                u = in.nextInt();
                v = in.nextInt();
                vector[u].add(v);
                vector[v].add(u);
            }

            for (int i = 1; i <= V; i++) {
                if (isVisited[i] == 0) {
                    DFS(i, 0);
                }
            }

            if (isExist) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static void DFS(int u, int before) {
        isVisited[u] = 1;
        for (int i : vector[u]) {
            if (isVisited[i] == 0) {
                DFS(i, u);
            } else if (isVisited[i] == 1 && i != before) {
                isExist = true;
            }
        }
        isVisited[u] = 2;
    }
}
