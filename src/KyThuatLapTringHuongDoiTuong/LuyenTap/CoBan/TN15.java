package KyThuatLapTringHuongDoiTuong.LuyenTap.CoBan;

import java.util.Scanner;

public class TN15 {
    private static int[][] matrix;
    private static int size;
    private static char[] result = new char[20];
    private static int index = 0;
    private static boolean hasResult = false;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            size = in.nextInt();
            matrix = new int[size][size];
            hasResult = false;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    matrix[i][j] = in.nextInt();
                }
            }
            if (matrix[0][0] != 1 || matrix[size - 1][size - 1] != 1) {
                System.out.print(-1);
            } else {
                backtracking(0, 0);
                if (!hasResult) System.out.print(-1);
            }
            System.out.println();
        }
    }

    private static void backtracking(int i, int j) {
        if (i == size - 1 && j == size - 1) {
            process();
            hasResult = true;
        }
        if (i < size - 1 && matrix[i + 1][j] == 1) {
            result[++index] = 'D';
            backtracking(i + 1, j);
            if (index > 0) --index;
        }
        if (j < size - 1 && matrix[i][j + 1] == 1) {
            result[++index] = 'R';
            backtracking(i, j + 1);
            if (index > 0) --index;
        }
    }

    private static void process() {
        for (int i = 1; i <= size * 2 - 2; i++) {
            System.out.print(result[i]);
        }
        System.out.print(" ");
    }
}
