package KyThuatLapTringHuongDoiTuong.LuyenTap.HuongDoiTuong;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J05022_LietKeSinhVienTheoLop {

    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("C:\\Users\\vinhm\\IdeaProjects\\PTIT\\src\\KyThuatLapTringHuongDoiTuong\\LuyenTap\\HuongDoiTuong\\Test.txt");
//        Scanner in = new Scanner(file);
        Scanner in = new Scanner(System.in);
        ArrayList<SinhVien> list = new ArrayList<>();
        int T = Integer.parseInt(in.nextLine());
        while (T-- > 0) {
            list.add(new SinhVien(
                    in.nextLine(),
                    in.nextLine(),
                    in.nextLine(),
                    in.nextLine()
            ));
        }

        int Q = Integer.parseInt(in.nextLine());
        String query;
        while (Q-- > 0) {
            query = in.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + query + ":");
            for (SinhVien sv : list) {
                if (sv.lop.equals(query)) {
                    System.out.println(sv);
                }
            }
        }
    }

    private static class SinhVien {
        private String ma, ten, lop, email;

        public SinhVien(String ma, String ten, String lop, String email) {
            this.ma = ma;
            this.ten = ten;
            this.lop = lop;
            this.email = email;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + lop + " " + email;
        }
    }
}
