package KyThuatLapTringHuongDoiTuong.ThiThu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachMonThi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        ArrayList<MonHoc> list = new ArrayList<>();
        while (T-- > 0) {
            list.add(new MonHoc(
                    in.nextLine(),
                    in.nextLine(),
                    in.nextLine()
            ));
        }
        Collections.sort(list);
        for (MonHoc i : list) {
            System.out.println(i);
        }
    }

    private static class MonHoc implements Comparable<MonHoc> {
        private String maMon, tenMon, hinhThuc;

        public MonHoc(String maMon, String tenMon, String hinhThuc) {
            this.maMon = maMon;
            this.tenMon = tenMon;
            this.hinhThuc = hinhThuc;
        }

        @Override
        public String toString() {
            return maMon + " " + tenMon + " " + hinhThuc;
        }

        @Override
        public int compareTo(MonHoc o) {
            return maMon.compareTo(o.maMon);
        }
    }
}
