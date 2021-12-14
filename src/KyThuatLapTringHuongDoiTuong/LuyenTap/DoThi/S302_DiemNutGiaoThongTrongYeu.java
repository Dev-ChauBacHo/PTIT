package KyThuatLapTringHuongDoiTuong.LuyenTap.DoThi;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class S302_DiemNutGiaoThongTrongYeu {

    private static Vector<Integer>[] vectors;
    private static int[] isVisited;
    private static int count = 0;
    private static ArrayList<Integer> result;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int V, E;
        int u, v;
        while (T-- > 0) {
            V = in.nextInt();
            E = in.nextInt();
            vectors = new Vector[V + 1];
            result = new ArrayList<>();
            for (int i = 0; i <= V; i++) {
                vectors[i] = new Vector<>();
            }
            for (int i = 1; i <= E; i++) {
                u = in.nextInt();
                v = in.nextInt();
                vectors[u].add(v);
                vectors[v].add(u);
            }
            isVisited = new int[V + 1];
            for (int i = 1; i <= V; i++) {
                isVisited[i] = 1;
                count = 1;
                if (i == 1) DFS(2); else DFS(1);
                if (count < V) result.add(i);
                isVisited = new int[V + 1];
            }
            System.out.println(result.size());
            for (int i : result) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static void DFS(int u) {
        for (int i : vectors[u]) {
            if (isVisited[i] == 0) {
                ++count;
                isVisited[i] = 1;
                DFS(i);
            }
        }
    }
}
