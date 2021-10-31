package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.util.Scanner;

public class NhanMaTran {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n, m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m, p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }

    private static class Matrix {
        private int[][] a;
        private int n, m;

        public Matrix(int n, int m) {
            this.a = new int[n][m];
            this.n = n;
            this.m = m;
        }

        public void nextMatrix(Scanner sc) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
        }

        public String mul(Matrix B) {
            int[][] result = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < B.m; j++) {
                    for (int k = 0; k < m; k++) {
                        result[i][j] += a[i][k] * (B.a)[k][j];
                    }
                }
            }

            StringBuilder s = new StringBuilder();
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j <result[0].length; j++) {
                    s.append(result[i][j]).append(" ");
                }
                s.append("\n");
            }
            return s.toString();
        }
    }
}
