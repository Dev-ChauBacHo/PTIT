package KyThuatLapTringHuongDoiTuong.LuyenTap.HuongDoiTuong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class J05004_DanhSachDoiTuongSinhVien2 {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= T; i++) {
            SinhVien sv = new SinhVien(
                    i,
                    in.nextLine(),
                    in.nextLine(),
                    in.nextLine(),
                    Float.parseFloat(in.nextLine())
            );
            System.out.println(sv);
        }
    }

    private static class SinhVien {
        private final String ma;
        private final String ten;
        private final String lop;
        private final String gpa;
        private final Date ngaySinh;

        public SinhVien(int id, String ten, String lop, String ngaySinh, float gpa) throws ParseException {
            this.ma = ((id < 10) ? "B20DCCN00" : "B20DCCN0") + id;
            this.ten = formatName(ten);
            this.lop = lop;
            this.gpa = String.format("%.2f", gpa);
            this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        }

        private String formatName(String s) {
            StringBuilder result = new StringBuilder();
            s = s.toLowerCase().trim();
            String[] l = s.split("\\s+");
            for (String x : l) {
                result.append(x.substring(0, 1).toUpperCase()).append(x.substring(1)).append(" ");
            }
            return result.toString();
        }

        @Override
        public String toString() {
            return ma + " " + ten + "" + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh) + " " + gpa;
        }
    }
}
