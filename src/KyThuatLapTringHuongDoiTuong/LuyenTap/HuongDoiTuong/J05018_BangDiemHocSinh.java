package KyThuatLapTringHuongDoiTuong.LuyenTap.HuongDoiTuong;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05018_BangDiemHocSinh {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        for (int i = 1; i <= T; i++) {
            list.add(new SinhVien(
                    i,
                    in.nextLine(),
                    new float[]{
                            in.nextFloat(),
                            in.nextFloat(),
                            in.nextFloat(),
                            in.nextFloat(),
                            in.nextFloat(),
                            in.nextFloat(),
                            in.nextFloat(),
                            in.nextFloat(),
                            in.nextFloat(),
                            in.nextFloat(),
                    }
            ));
            in.nextLine();
        }
        Collections.sort(list);
        for (SinhVien sv : list) {
            System.out.println(sv);
        }
    }

    private static class SinhVien implements Comparable<SinhVien> {
        private String ma, ten;
        private float[] diem;
        private float tb;

        public SinhVien(int id, String ten, float[] diem) {
            this.ma = ((id < 10) ? "HS0" : "HS") + id;
            this.ten = ten;
            this.diem = diem;
            tinhTrungBinh();
        }

        private void tinhTrungBinh() {
            DecimalFormat df = new DecimalFormat("0.0");
            float sum = 0;
            for (int i = 2; i < diem.length; i++) {
                sum += diem[i];
            }
            sum += 2 * diem[0] + 2 * diem[1];
//            tb = Float.parseFloat(df.format(sum / 12));
//            tb = Float.parseFloat(String.format("%.1f", sum / 12));
            tb = (float) Math.round(sum / 12 * 10f) / 10f;
        }

        @Override
        public int compareTo(SinhVien o) {
            if (tb < o.tb) {
                return 1;
            } else if (tb > o.tb) {
                return -1;
            } else {
//                return Integer.parseInt(ma.substring(2)) - Integer.parseInt(o.ma.substring(2));
                return ma.compareTo(o.ma);
            }
        }

        @Override
        public String toString() {
            String hocLuc;
            if (tb >= 9) {
                hocLuc = "XUAT SAC";
            } else if (8 <= tb && tb <= 8.9) {
                hocLuc = "GIOI";
            } else if (7 <= tb && tb <= 7.9) {
                hocLuc = "KHA";
            } else if (5 <= tb && tb <= 6.9) {
                hocLuc = "TB";
            } else {
                hocLuc = "YEU";
            }
            return ma + " " + ten + " " + tb + " " + hocLuc;
        }
    }
}
