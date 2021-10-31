package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WA_LietKeNhapXuatHangTheoNhom {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        ArrayList<HangHoa> list = new ArrayList<>();
        ArrayList<HangHoa> result = new ArrayList<>();
        while (T-- > 0) {
            list.add(new HangHoa(
                    in.nextLine(),
                    Long.parseLong(in.nextLine())
            ));
        }
        String s = in.nextLine();
        for (HangHoa h : list) {
            if (h.maHang.substring(0, 1).equals(s)) {
                result.add(h);
            }
        }
        Collections.sort(result);
        for (HangHoa h : result) {
            System.out.println(h);
        }
    }

    private static class HangHoa implements Comparable<HangHoa> {
        private String maHang;
        private long soLuongNhap, soLuongXuat, donGia, tien, thue;

        public HangHoa(String maHang, long soLuongNhap) {
            this.maHang = maHang;
            this.soLuongNhap = soLuongNhap;
            xuly();
        }

        private void xuly() {
            if (maHang.charAt(0) == 'A') {
                soLuongXuat = Math.round(soLuongNhap * 0.6);
                if (maHang.charAt(4) == 'Y') {
                    thue = 8;
                } else {
                    thue = 11;
                }
            } else {
                soLuongXuat = Math.round(soLuongNhap * 0.7);
                if (maHang.charAt(4) == 'Y') {
                    thue = 17;
                } else {
                    thue = 22;
                }
            }

            if (maHang.charAt(4) == 'Y') {
                donGia = 110000;
            } else {
                donGia = 135000;
            }

            tien = soLuongXuat * donGia;
        }

        @Override
        public int compareTo(HangHoa o) {
            return Float.compare(thue, o.thue);
        }

        @Override
        public String toString() {
            return maHang + " " + soLuongNhap + " " + soLuongXuat + " " + donGia + " " + tien + " " + (tien / 100 * thue);
        }
    }
}
