package KyThuatLapTringHuongDoiTuong.ThiHetMon;

import java.util.Scanner;
import java.util.Vector;

public class DoThiDayDu {

    private static Vector<Integer>[] vectors;
    private static int[] isVisited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int u, v;
        int N = in.nextInt();
        int M = in.nextInt();
        vectors = new Vector[N+5];
        isVisited = new int[N + 2];

        for (int i = 1; i <= N + 2; i++) {
            vectors[i] = new Vector<>();
        }

        for (int i = 1; i <= M; i++) {
            u = in.nextInt();
            v = in.nextInt();
            vectors[u].add(v);
            vectors[v].add(u);
        }

        DFS(1);

        boolean isExist = false;
        for (int i = 1; i <= N; i++) {
            if (isVisited[i] == 0) {
                isExist = true;
                break;
            }
        }
        if (isExist) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static void DFS(int u) {
        isVisited[u] = 1;
        for (int i: vectors[u]) {
            if (isVisited[i] == 0) {
                DFS(i);
            }
        }
    }
}
