package KyThuatLapTringHuongDoiTuong.LuyenTap.HuongDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05011_TinhGio {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        ArrayList<Gamer> list = new ArrayList<>();
        while (T-- > 0) {
            list.add(new Gamer(
                    in.nextLine(),
                    in.nextLine(),
                    in.nextLine(),
                    in.nextLine()
            ));
        }
        Collections.sort(list);
        for (Gamer g : list) {
            System.out.println(g);
        }
    }

    private static class Gamer implements Comparable<Gamer> {
        private String ma, ten, batdau, ketthuc;
        private int gio, phut;

        public Gamer(String ma, String ten, String batdau, String ketthuc) {
            this.ma = ma;
            this.ten = ten;
            this.batdau = batdau;
            this.ketthuc = ketthuc;
            khoangThoiGian();
        }

        private void khoangThoiGian() {
            int gioVao = Integer.parseInt(batdau.split(":")[0]);
            int phutVao = Integer.parseInt(batdau.split(":")[1]);
            int gioRa = Integer.parseInt(ketthuc.split(":")[0]);
            int phutRa = Integer.parseInt(ketthuc.split(":")[1]);

            gio = gioRa - gioVao;
            if (phutVao <= phutRa) {
                phut = phutRa - phutVao;
            } else {
                phut = 60 - phutVao + phutRa;
                --gio;
            }

        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + gio + " gio " + phut + " phut";
        }

        @Override
        public int compareTo(Gamer o) {
            return (o.gio * 60 + o.phut) - (gio * 60 + phut);
        }
    }
}
