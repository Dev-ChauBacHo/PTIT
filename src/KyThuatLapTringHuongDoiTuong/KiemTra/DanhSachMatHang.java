package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachMatHang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> list = new ArrayList<>();
        for (int i = 1; i <= T; i++) {
            list.add(new MatHang(
                    i,
                    sc.nextLine(),
                    sc.nextLine(),
                    Long.parseLong(sc.nextLine()),
                    Long.parseLong(sc.nextLine())
            ));
        }

        Collections.sort(list);
        for (MatHang mh : list) {
            System.out.println(mh);
        }
    }

    private static class MatHang implements Comparable<MatHang> {
        private String ma, ten, donVi;
        private long giaMua, giaBan;

        public MatHang(int ma, String ten, String donVi, long giaMua, long giaBan) {
            this.ma = ((ma < 10) ? "MH00" : "MH0") + ma;
            this.ten = ten;
            this.donVi = donVi;
            this.giaMua = giaMua;
            this.giaBan = giaBan;
        }

        @Override
        public int compareTo(MatHang o) {
            if (giaMua - giaBan == o.giaMua - o.giaBan) {
                return ma.compareTo(o.ma);
            }
            return Long.compare(giaMua - giaBan, o.giaMua - o.giaBan);
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + donVi + " " + giaMua + " " + giaBan + " " + (giaBan - giaMua);
        }
    }
}
