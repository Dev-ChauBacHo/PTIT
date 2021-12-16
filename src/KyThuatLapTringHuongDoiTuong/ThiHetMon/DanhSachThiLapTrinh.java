package KyThuatLapTringHuongDoiTuong.ThiHetMon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachThiLapTrinh {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());

        ArrayList<Team> teams = new ArrayList<>();
        teams.add(new Team("", ""));
        for (int i = 1; i <= T; i++) {
            teams.add(new Team(
                    in.nextLine(),
                    in.nextLine()
            ));
        }

        ArrayList<SinhVien> sinhViens = new ArrayList<>();
        T = Integer.parseInt(in.nextLine());
        String s, x;
        int p;
        Team t;
        for (int i = 1; i <= T; i++) {
            s = in.nextLine();
            x = in.nextLine();
            p = Integer.parseInt(x.substring(4));
            t = teams.get(p);
            sinhViens.add(new SinhVien(
                    i,
                    s,
                    t.tenTeam,
                    t.tenTruong
            ));
        }

//        for (Team i: teams) {
//            System.out.println(i);
//        }
//        for (SinhVien i : sinhViens) {
//            System.out.println(i);
//        }
        Collections.sort(sinhViens);
        for (SinhVien i : sinhViens) {
            System.out.println(i);
        }
    }

    private static class Team {
        String tenTeam, tenTruong;

        public Team(String tenTeam, String tenTruong) {
            this.tenTeam = tenTeam;
            this.tenTruong = tenTruong;
        }

        @Override
        public String toString() {
            return "Team{" +
                    "tenTeam='" + tenTeam + '\'' +
                    ", tenTruong='" + tenTruong + '\'' +
                    '}';
        }
    }

    private static class SinhVien implements Comparable<SinhVien> {
        String id, hoTen, tenTeam, tenTruong;

        public SinhVien(int id, String hoTen) {
            this.id = "C" + String.format("%03d", id);
            this.hoTen = hoTen;
        }

        public SinhVien(int id, String hoTen, String tenTeam, String tenTruong) {
            this.id = "C" + String.format("%03d", id);
            this.hoTen = hoTen;
            this.tenTeam = tenTeam;
            this.tenTruong = tenTruong;
        }

        @Override
        public int compareTo(SinhVien o) {
//            if (this.hoTen.equals(o.hoTen)) {
//                return -this.id.compareTo(o.id);
//            }
            return this.hoTen.compareTo(o.hoTen);
        }

        @Override
        public String toString() {
            return id + " " + hoTen + " " + tenTeam + " " + tenTruong;
        }
    }
}
