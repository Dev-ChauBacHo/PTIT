package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.util.*;

public class DuongDiCoHuong {
    private static Queue<Integer> queue;
    private static Vector<Integer>[] vectors;
    private static int u, v;
    private static int[] track;
    private static int[] isVisited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int V, E;
        while (T-- > 0) {
            V = in.nextInt();
            E = in.nextInt();
            u = in.nextInt();
            v = in.nextInt();
            vectors = new Vector[V + 1];
            track = new int[V + 1];
            isVisited = new int[V + 1];
            for (int i = 0; i <= V; i++) {
                vectors[i] = new Vector<>();
            }
            for (int i = 1; i <= E; i++) {
                vectors[in.nextInt()].add(in.nextInt());
            }
            process();
        }
    }

    private static void process() {
        queue = new LinkedList<>();
        queue.add(u);
        isVisited[u] = 1;
        int x;
        while (!queue.isEmpty()) {
            x = queue.poll();
            if (x == v) {
                break;
            }
            for (int i : vectors[x]) {
                if (isVisited[i] == 0) {
                    queue.add(i);
                    track[i] = x;
                    isVisited[i] = 1;
                }
            }
        }
        if (track[v] == 0) {
            System.out.println(-1);
        } else {
            Stack<Integer> stack = new Stack<>();
            x = v;
            stack.push(v);
            while (x != u) {
                x = track[x];
                stack.push(x);
            }
            while (!stack.isEmpty()) {
                if (stack.size() > 1) {
                    System.out.print(stack.pop() + " -> ");
                } else {
                    System.out.print(stack.pop());
                }
            }
            System.out.println();
        }
    }
}
