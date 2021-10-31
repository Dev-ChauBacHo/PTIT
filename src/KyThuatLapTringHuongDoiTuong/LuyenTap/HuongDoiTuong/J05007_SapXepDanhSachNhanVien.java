package KyThuatLapTringHuongDoiTuong.LuyenTap.HuongDoiTuong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class J05007_SapXepDanhSachNhanVien {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        ArrayList<NhanVien> list = new ArrayList<>();
        for (int i = 1; i <= T; i++) {
            list.add(new NhanVien(
                            i,
                            in.nextLine(),
                            in.nextLine(),
                            in.nextLine(),
                            in.nextLine(),
                            in.nextLine(),
                            in.nextLine()
                    )
            );
        }
        Collections.sort(list);
        for (NhanVien i : list) {
            System.out.println(i);
        }
    }

    private static class NhanVien implements Comparable<NhanVien> {
        private final String ma;
        private final String hoTen;
        private final String gioiTinh;
        private final String diaChi;
        private final String maSoThue;
        private final Date ngaySinh;
        private final Date ngayKy;

        public NhanVien(int id, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKy) throws ParseException {
            this.ma = String.format("%05d", id);
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

        @Override
        public int compareTo(NhanVien o) {
            return this.ngaySinh.compareTo(o.ngaySinh);
        }
    }
}
