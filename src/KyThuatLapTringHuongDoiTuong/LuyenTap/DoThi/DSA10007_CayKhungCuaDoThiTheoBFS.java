package KyThuatLapTringHuongDoiTuong.LuyenTap.DoThi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class DSA10007_CayKhungCuaDoThiTheoBFS {

    private static Vector<Integer>[] vectors;
    private static Queue<Integer> queue;
    private static int[] isVisited;
    private static int[] track;
    private static int count;

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
            track = new int[E * 2];
            count = 0;
            for (int i = 0; i < V + 1; i++) {
                vectors[i] = new Vector<>();
            }
            for (int i = 1; i <= E; i++) {
                u = in.nextInt();
                v = in.nextInt();
                vectors[u].add(v);
                vectors[v].add(u);
            }
            isVisited[s] = 1;
            BFS(s);

            printOut(V);
        }
    }

    private static void printOut(int V) {
        for (int i = 1; i <= V; i++) {
            if (isVisited[i] == 0) {
                System.out.println(-1);
                return;
            }
        }
        for (int i = 1; i < count; i++) {
            System.out.println(track[i] + " " + track[++i]);
        }
    }

    private static void DFS(int u) {
        for (int i : vectors[u]) {
            if (isVisited[i] == 0) {
                isVisited[i] = 1;
                track[++count] = u;
                track[++count] = i;
                DFS(i);
            }
        }
    }

    private static void BFS(int u) {
        queue = new LinkedList<>();
        queue.add(u);
        isVisited[u] = 1;
        int x;
        while (!queue.isEmpty()) {
            x = queue.poll();
            for (int i: vectors[x]) {
                if (isVisited[i] == 0) {
                    queue.add(i);
                    isVisited[i] = 1;
                    track[++count] = x;
                    track[++count] = i;
                }
            }
        }
    }
}
