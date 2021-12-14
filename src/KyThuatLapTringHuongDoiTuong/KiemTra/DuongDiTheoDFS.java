package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class DuongDiTheoDFS {

    private static Vector<Integer>[] vectors;
    private static int[] isVisited, track;
    private static Stack<Integer> stack;
    private static int size = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int V, E, u, v, x;

        while (T-- > 0) {
            V = in.nextInt();
            E = in.nextInt();
            x = in.nextInt();

            vectors = new Vector[V + 2];
            isVisited = new int[V + 2];
            track = new int[V + 2];

            for (int i = 0; i <= V + 1; i++) {
                vectors[i] = new Vector<>();
            }

            for (int i = 1; i <= E; i++) {
                u = in.nextInt();
                v = in.nextInt();
                vectors[u].add(v);
                vectors[v].add(u);
            }
            DFS(x);

            int t;
            stack = new Stack<>();
            for (int i = 1; i <= V; i++) {
                if (x != i) {
                    if (track[i] == 0) {
                        System.out.println("No path");
                    } else {
                        t = i;
                        stack.push(t);
                        while (t != x) {
                            t = track[t];
                            stack.push(t);
                        }
                        while (!stack.isEmpty()) {
                            System.out.print(stack.pop() + " ");
                        }
                        System.out.println();
                    }
                }
            }

//            for (int i = 1; i <= V; i++) {
//                if (x != i) {
//                    isVisited = new int[V + 2];
//                    track = new int[V + 2];
//                    size = 0;
//                    isVisited[x] = 1;
//                    track[++size] = x;
//                    if (!DFS(x, i)) {
//                        System.out.println("No path");
//                    } else {
//                        for (int j = 1; j <= size; j++) {
//                            System.out.print(track[j] + " ");
//                        }
//                        System.out.println();
//                    }
//                }
//            }
        }
    }

    private static void DFS(int u) {
        for (int i : vectors[u]) {
            if (isVisited[i] == 0) {
                isVisited[i] = 1;
                track[i] = u;
                DFS(i);
            }
        }
    }

//    private static boolean DFS(int u, int v) {
//        if (u == v) return true;
//        for (int i : vectors[u]) {
//            if (isVisited[i] == 0) {
//                isVisited[i] = 1;
//                track[++size] = i;
//                if (DFS(i, v)) return true;
//                isVisited[i] = 0;
//                --size;
//            }
//        }
//        return false;
//    }
}
