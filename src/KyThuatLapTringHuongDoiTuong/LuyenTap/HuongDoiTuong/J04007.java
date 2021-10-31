package KyThuatLapTringHuongDoiTuong.LuyenTap.HuongDoiTuong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class J04007 {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        NhanVien nv = new NhanVien(
                in.nextLine(),
                in.nextLine(),
                in.nextLine(),
                in.nextLine(),
                in.nextLine(),
                in.nextLine()
        );
        System.out.println(nv);
    }

    private static class NhanVien {
        private final String ma;
        private final String hoTen;
        private final String gioiTinh;
        private final String diaChi;
        private final String maSoThue;
        private final Date ngaySinh;
        private final Date ngayKy;

        public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKy) throws ParseException {
            this.ma = "00001";
            this.hoTen = hoTen;
            this.gioiTinh = gioiTinh;
            this.diaChi = diaChi;
            this.maSoThue = maSoThue;
            this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
            this.ngayKy = new SimpleDateFormat("dd/MM/yyyy").parse(ngayKy);
        }

        @Override
        public String toString() {
            return ma + " " + hoTen + " " + gioiTinh + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh) + " "
                    + diaChi + " " + maSoThue + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngayKy);
        }
    }
}
