package KyThuatLapTringHuongDoiTuong.LuyenTap.HuongDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05058_SapXepKetQuaTuyenSinh {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        ArrayList<ThiSinh> list = new ArrayList<>();
        while (T-- > 0) {
            list.add(new ThiSinh(
                    in.nextLine(),
                    in.nextLine(),
                    Float.parseFloat(in.nextLine()),
                    Float.parseFloat(in.nextLine()),
                    Float.parseFloat(in.nextLine())
            ));
        }
        Collections.sort(list);
        for (ThiSinh t : list) {
            System.out.println(t);
        }
    }

    private static class ThiSinh implements Comparable<ThiSinh> {
        private String ma, ten;
        private float diem, diemUuTien;

        public ThiSinh(String ma, String ten, float toan, float ly, float hoa) {
            this.ma = ma;
            this.ten = ten;
            tinhDiem(toan, ly, hoa);
        }

        private void tinhDiem(float toan, float ly, float hoa) {
            diem = toan * 2 + ly + hoa;
            String s = ma.substring(0, 3);
            if (s.equals("KV1")) {
                diemUuTien = 0.5f;
            } else if (s.equals("KV2")) {
                diemUuTien = 1f;
            } else {
                diemUuTien = 2.5f;
            }
            diem += diemUuTien;
        }

        private String chuanHoaSoThuc(float num) {
            float Num1Decimal = (float) Math.round(num * 10f) / 10f;
            int NumInt = Math.round(num);

            if (Num1Decimal == (float) NumInt) {
                return NumInt + "";
            } else {
                return Num1Decimal + "";
            }
        }

        @Override
        public int compareTo(ThiSinh o) {
            if (diem == o.diem) {
                return ma.compareTo(o.ma);
            }
            return -Float.compare(diem, o.diem);
        }

        @Override
        public String toString() {
            String status = (Float.parseFloat(chuanHoaSoThuc(diem)) >= 24) ? "TRUNG TUYEN" : "TRUOT";
            return ma + " " + ten + " " + chuanHoaSoThuc(diemUuTien) + " " + chuanHoaSoThuc(diem) + " " + status;
        }
    }
}
