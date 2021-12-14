package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class LienThong {
    private static Queue<Integer> queue;
    private static Vector<Integer>[] vectors;
    private static int[] isVisited;
    private static int X;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int V, E;
        int u, v;
        V = in.nextInt();
        E = in.nextInt();
        X = in.nextInt();
        vectors = new Vector[V + 1];
        isVisited = new int[V + 1];
        for (int i = 0; i <= V; i++) {
            vectors[i] = new Vector<>();
        }
        for (int i = 1; i <= E; i++) {
            u = in.nextInt();
            v = in.nextInt();
            vectors[u].add(v);
            vectors[v].add(u);
        }
        process();

    }

    private static void process() {
        queue = new LinkedList<>();
        queue.add(X);
        isVisited[X] = 1;
        int x;
        int isExist = 0;
        while (!queue.isEmpty()) {
            x = queue.poll();
            for (int i : vectors[x]) {
                if (isVisited[i] == 0) {
                    queue.add(i);
                    isVisited[i] = 1;
                }
            }
        }
        for (int i = 1; i < isVisited.length; i++) {
            if (isVisited[i] == 0) {
                isExist = 1;
                System.out.println(i);
            }
        }
        if (isExist == 0) {
            System.out.println(0);
        }
    }
}
