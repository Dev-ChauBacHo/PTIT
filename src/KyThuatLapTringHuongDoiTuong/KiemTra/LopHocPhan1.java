package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LopHocPhan1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        ArrayList<HocPhan> list = new ArrayList<>();
        while (T-- > 0) {
            list.add(new HocPhan(
                    in.nextLine(),
                    in.nextLine(),
                    in.nextLine(),
                    in.nextLine()
            ));
        }
        int n = Integer.parseInt(in.nextLine());
        String s;
        ArrayList<HocPhan> result;
        while (n-- > 0) {
            s = in.nextLine();
            result = new ArrayList<>();
            for (HocPhan h : list) {
                if (h.ma.equals(s)) {
                    System.out.println("Danh sach nhom lop mon " + h.ten + ":");
                    break;
                }
            }

            for (HocPhan h : list) {
                if (h.ma.equals(s)) {
                    result.add(h);
                }
            }

            Collections.sort(result);
            for (HocPhan h : result) {
                System.out.println(h);
            }
        }
    }

    private static class HocPhan implements Comparable<HocPhan> {
        private String ma, ten, nhom, giangVien;

        public HocPhan(String ma, String ten, String nhom, String giangVien) {
            this.ma = ma;
            this.ten = ten;
            this.nhom = nhom;
            this.giangVien = giangVien;
        }

        @Override
        public String toString() {
            return nhom + " " + giangVien;
        }

        @Override
        public int compareTo(HocPhan o) {
            return nhom.compareTo(o.nhom);
        }
    }
}
