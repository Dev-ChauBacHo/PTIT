package KyThuatLapTringHuongDoiTuong.LuyenTap.HuongDoiTuong;

import java.util.Scanner;

public class J04015_TinhThuNhapGiaoVien {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GiaoVien gv = new GiaoVien(
                in.nextLine(),
                in.nextLine(),
                Integer.parseInt(in.nextLine())
        );
        System.out.println(gv);
    }

    private static class GiaoVien {
        private final String ma;
        private final String hoten;
        private final int luongCoBan;
        private int bacLuong;
        private int phuCap;

        public GiaoVien(String ma, String hoten, int luongCoBan) {
            this.ma = ma;
            this.hoten = hoten;
            this.luongCoBan = luongCoBan;
        }

        private int phuCap(String s) {
            int l;
            switch (s) {
                case "HT":
                    l = 2000000;
                    break;
                case "HP":
                    l = 900000;
                    break;
                case "GV":
                    l = 500000;
                    break;
                default:
                    l = 1;
            }
            return l;
        }

        private int tongLuong() {
            return bacLuong * luongCoBan + phuCap;
        }

        @Override
        public String toString() {
            phuCap = phuCap(ma.substring(0, 2));
            bacLuong = Integer.parseInt(ma.substring(2));
            return ma + " " + hoten + " " + bacLuong + " " + phuCap + " " + tongLuong();
        }
    }
}
