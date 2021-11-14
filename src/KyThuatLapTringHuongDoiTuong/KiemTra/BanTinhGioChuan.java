package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.util.ArrayList;
import java.util.Scanner;

public class BanTinhGioChuan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> monHocs = new ArrayList<>();
        ArrayList<GiangVien> giangViens = new ArrayList<>();

        while (T-- > 0) {
            monHocs.add(new MonHoc(
                            sc.next(),
                            sc.nextLine()
                    )
            );
//            sc.nextLine();
        }

        T = Integer.parseInt(sc.nextLine());
        while (T-- > 0) {
            giangViens.add(new GiangVien(
                            sc.next(),
                            sc.nextLine()
                    )
            );
//            sc.nextLine();
        }

        T = Integer.parseInt(sc.nextLine());
        String maGV, maMH;
        float gio;
        GiangVien g = null;
        MonHoc m = null;
        while (T-- > 0) {
            maGV = sc.next();
            maMH = sc.next();
            gio = Float.parseFloat(sc.next());
            for (GiangVien gv : giangViens) {
                if (gv.ma.equals(maGV)) {
                    g = gv;
                }
            }
            for (MonHoc mh : monHocs) {
                if (mh.ma.equals(maMH)) {
                    mh.gio += gio;
                    m = mh;
                }
            }
            if (m != null & g != null) g.list.add(m);
            sc.nextLine();
        }

        String s = sc.nextLine();
//        for (GiangVien gv : giangViens) {
//            if (gv.ma.equals(s)) {
//                System.out.println(gv);
//            }
//        }
        float sum = 0f;
        for (GiangVien gv : giangViens) {
            if (gv.ma.equals(s)) {
                System.out.println("Giang vien: " + gv.tenGV);
                for (MonHoc mh : gv.list) {
                    sum += mh.gio;
                    System.out.println(mh);
                }
                System.out.println("Tong: " + String.format("%.2f", sum));
            }
        }
    }

    private static class MonHoc {
        private String ma, ten;
        float gio;

        public MonHoc(String ma, String ten) {
            this.ma = ma;
            this.ten = ten.replaceFirst(" ", "");
        }

        @Override
        public String toString() {
            return ten + " " + gio;
        }
    }

    private static class GiangVien {
        private String ma, tenGV;
        private ArrayList<MonHoc> list;

        public GiangVien(String ma, String tenGV) {
            this.ma = ma;
            this.tenGV = tenGV.replaceFirst(" ", "");
            this.list = new ArrayList<>();
        }

//        @Override
//        public String toString() {
//            System.out.println(String.format("%.2f", gio));
//            return ten + " " + ((float) Math.round(gio * 100f) / 100f + "");
//            return tenGV + " " + String.format("%.2f", gio);
//        }
    }
}
