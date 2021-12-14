package KyThuatLapTringHuongDoiTuong.LuyenTap.DoThi;

import java.util.*;

public class TN05003_DuongDiTheoBFS {


    private static Queue<Integer> queue;
    private static Vector<Integer>[] vectors;
    private static int u, v;
    private static int[] isVisited;
    private static int[] track;
    private static Stack<Integer> results;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int V, E, x, y;
        while (T-- > 0) {
            V = in.nextInt();
            E = in.nextInt();
            x = in.nextInt();
            vectors = new Vector[V + 5];
            isVisited = new int[V + 5];
            track = new int[V + 5];
            results = new Stack<>();

            for (int i = 0; i <= V + 4; i++) {
                vectors[i] = new Vector<>();
            }
            for (int i = 1; i <= E; i++) {
                u = in.nextInt();
                v = in.nextInt();
                vectors[u].add(v);
                vectors[v].add(u);
            }
            process(x);
            for (int i = 1; i <= V; i++) {
                if (i != x) {
                    if (track[i] == 0) {
                        System.out.println("No path");
                    } else {
                        int n = i;
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
        }
    }

    private static void process(int u) {
        queue = new LinkedList<>();
        queue.add(u);
        isVisited[u] = 1;
        int x;
        while (!queue.isEmpty()) {
            x = queue.poll();
            for (int i : vectors[x]) {
                if (isVisited[i] == 0) {
                    queue.add(i);
                    track[i] = x;
                    isVisited[i] = 1;
                }
            }
        }
    }
}
