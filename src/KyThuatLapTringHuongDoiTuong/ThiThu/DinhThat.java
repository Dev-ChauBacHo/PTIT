package KyThuatLapTringHuongDoiTuong.ThiThu;

import java.util.Scanner;
import java.util.Vector;

public class DinhThat {

    private static Vector<Integer>[] vectors;
    private static int[] isVisited;
    private static int u, v, count;
    private static boolean isExist;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int N, M;
        while (T-- > 0) {
            N = in.nextInt();
            M = in.nextInt();
            u = in.nextInt();
            v = in.nextInt();
            vectors = new Vector[N + 2];
            isVisited = new int[N + 2];
            count = 0;
            for (int i = 0; i <= N + 1; i++) {
                vectors[i] = new Vector<>();
            }
            for (int i = 1; i <= M; i++) {
                vectors[in.nextInt()].add(in.nextInt());
            }

            for (int i = 1; i <= N; i++) {
                if (i != u && i != v) {
                    isVisited = new int[N + 2];
                    isExist = false;
                    isVisited[i] = 1;
                    DFS(u);
                    if (!isExist) {
                        ++count;
                    }
                }
            }
            System.out.println(count);
        }
    }

    private static void DFS(int x) {
        if (x == v) {
            isExist = true;
            return;
        }
        for (int i : vectors[x]) {
            if (isVisited[i] == 0) {
                isVisited[i] = 1;
                DFS(i);
            }
        }
    }
}
