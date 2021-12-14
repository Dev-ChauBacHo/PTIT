package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class ChuTrinhTheoDFS {

    private static Vector<Integer>[] vectors;
    private static int[] isVisited, track;
    private static Stack<Integer> stack;
    private static int size = 0;
    private static boolean isExist;
    private static ArrayList<String> list;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int V, E, u, v;

        while (T-- > 0) {
            V = in.nextInt();
            E = in.nextInt();

            vectors = new Vector[V + 2];

            for (int i = 0; i <= V + 1; i++) {
                vectors[i] = new Vector<>();
            }

            for (int i = 1; i <= E; i++) {
                u = in.nextInt();
                v = in.nextInt();
                vectors[u].add(v);
                vectors[v].add(u);
            }

            isExist = false;
            isVisited = new int[V + 2];
            track = new int[V + 2];
            size = 0;
            track[++size] = 1;
            isVisited[1] = 1;
            list = new ArrayList<>();
            DFS(1, 0);
            if (!isExist) {
                System.out.println("NO");
            }

        }
    }

    private static void DFS(int u, int before) {
        for (int i : vectors[u]) {
            if (isVisited[i] == 0) {
                isVisited[i] = 1;
                if (!isExist) track[++size] = i;
                DFS(i, u);
                isVisited[i] = 0;
                --size;
            } else if (isVisited[i] == 1 && i != before) {
                isExist = true;
                StringBuilder s = new StringBuilder();
                for (int j = 1; j <= size; j++) {
                    s.append(track[j]).append(" ");
                }
                s.append(1);
                return;
            }
        }
        isVisited[u] = 2;
    }
}
