package KyThuatLapTringHuongDoiTuong.LuyenTap.DoThi;

import java.util.Scanner;
import java.util.Vector;

public class DSA09003_BieuDienDoThiCoHuong {

    private static Vector<Integer>[] vectors;
    private static int[] isVisited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int V, E, u, v, s;
        while (T-- > 0) {
            V = in.nextInt();
            E = in.nextInt();
            isVisited = new int[V + 1];
            vectors = new Vector[V + 1];
            for (int i = 0; i <= V; i++) {
                vectors[i] = new Vector<>();
            }
            for (int i = 1; i <= E; i++) {
                u = in.nextInt();
                v = in.nextInt();
                vectors[u].add(v);
            }
            for (int i = 1; i <= V; i++) {
                System.out.print(i + ": ");
                for (int j : vectors[i]) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }

        }
    }
}
