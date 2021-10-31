package KyThuatLapTringHuongDoiTuong.LuyenTap.HuongDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05020_SapXepSinhVienTheoLop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();

        while (T-- > 0) {
            list.add(new SinhVien(
                    in.nextLine(),
                    in.nextLine(),
                    in.nextLine(),
                    in.nextLine()
            ));
        }
        Collections.sort(list);
        list.forEach(sv -> System.out.println(sv));
    }

    private static class SinhVien implements Comparable<SinhVien> {
        private String ma, ten, lop, email;

        public SinhVien(String ma, String ten, String lop, String email) {
            this.ma = ma;
            this.ten = ten;
            this.lop = lop;
            this.email = email;
        }

        @Override
        public int compareTo(SinhVien o) {
            if (lop.equals(o.lop)) {
                return ma.compareTo(o.ma);
            } else {
                return lop.compareTo(o.lop);
            }
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + lop + " " + email;
        }
    }
}
