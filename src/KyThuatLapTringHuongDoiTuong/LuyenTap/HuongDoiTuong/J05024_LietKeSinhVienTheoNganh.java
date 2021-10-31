package KyThuatLapTringHuongDoiTuong.LuyenTap.HuongDoiTuong;

import java.util.ArrayList;
import java.util.Scanner;

public class J05024_LietKeSinhVienTheoNganh {

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

        int Q = Integer.parseInt(in.nextLine());
        String s, temp;
        while (Q-- > 0) {
            s = in.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH " + s.toUpperCase() + ":");
            for (SinhVien i : list) {
                temp = i.ma;
                if (s.equalsIgnoreCase("Ke toan") &&
                        temp.contains("DCKT")) {
                    System.out.println(i);
                } else if (s.equalsIgnoreCase("Cong nghe thong tin") &&
                        temp.contains("DCCN") &&
                        i.lop.charAt(0) != 'E') {
                    System.out.println(i);
                } else if (s.equalsIgnoreCase("An toan thong tin") &&
                        temp.contains("DCAT") &&
                        i.lop.charAt(0) != 'E') {
                    System.out.println(i);
                } else if (s.equalsIgnoreCase("Vien thong") &&
                        temp.contains("DCVT")) {
                    System.out.println(i);
                } else if (s.equalsIgnoreCase("Dien tu") &&
                        temp.contains("DCDT")) {
                    System.out.println(i);
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
