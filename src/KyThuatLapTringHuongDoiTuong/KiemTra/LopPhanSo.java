package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.util.Scanner;

public class LopPhanSo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            PhanSo A = new PhanSo(sc.nextLine());
            PhanSo B = new PhanSo(sc.nextLine());
            PhanSo tongAB = A.cong(B);
            PhanSo tichAB = A.nhan(B);
            PhanSo C = tongAB.nhan(tongAB);
            System.out.println(C);
            System.out.println(tichAB.nhan(C));
        }
    }

    private static class PhanSo {
        private long ts, ms;

        public PhanSo(String s) {
            ts = Long.parseLong(s.split(" ")[0]);
            ms = Long.parseLong(s.split(" ")[1]);
        }

        public PhanSo(long ts, long ms) {
            this.ts = ts;
            this.ms = ms;
        }

        public PhanSo cong(PhanSo b) {
            PhanSo x = new PhanSo(
                    ts * b.ms + b.ts * ms,
                    ms * b.ms
            );
//            System.out.println(x);
            return x;
        }

        public PhanSo nhan(PhanSo b) {
            return rutGon(new PhanSo(
                    ts * b.ts,
                    ms * b.ms
            ));
        }

        private PhanSo rutGon(PhanSo b) {
            long x = b.ts;
            long y = b.ms;
            if (b.ts > b.ms) {
                x = b.ms;
                y = b.ts;
            }
            long j = 1;
            long t = y;
            long i = 2;
            while (i <= Math.sqrt(t)) {
                if (x % i == 0 && y % i == 0) {
                    x /= i;
                    y /= i;
                    j *= i;
                } else {
                    ++i;
                }
            }
            return new PhanSo(b.ts / j, b.ms / j);
        }

        @Override
        public String toString() {
            return ts + "/" + ms;
        }
    }
}
