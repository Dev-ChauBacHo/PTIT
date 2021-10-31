package KyThuatLapTringHuongDoiTuong.LuyenTap.HuongDoiTuong;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05021_SapXepTheoMaSinhVien {

    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("C:\\Users\\vinhm\\IdeaProjects\\PTIT\\src\\KyThuatLapTringHuongDoiTuong\\LuyenTap\\HuongDoiTuong\\Test.txt");
//        Scanner in = new Scanner(file);
        Scanner in = new Scanner(System.in);
        ArrayList<SinhVien> list = new ArrayList<>();

        while (in.hasNext()) {
            list.add(new SinhVien(
                    in.nextLine(),
                    in.nextLine(),
                    in.nextLine(),
                    in.nextLine()
            ));
        }
        Collections.sort(list);
//        list.forEach(sv -> System.out.println(sv));
        for (SinhVien sv : list) {
            System.out.println(sv);
        }
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
//            if (lop.equals(o.lop)) {
//                return ma.compareTo(o.ma);
//            } else {
            return ma.compareTo(o.ma);
//            }
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + lop + " " + email;
        }
    }
}
