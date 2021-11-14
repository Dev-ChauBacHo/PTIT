package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DanhSachKhachHang {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> list = new ArrayList<>();
        for (int i = 1; i <= T; i++) {
            list.add(new KhachHang(
                    i,
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine()
            ));
        }
        Collections.sort(list);
        for (KhachHang k : list) {
            System.out.println(k);
        }
    }

    private static class KhachHang implements Comparable<KhachHang> {
        private String ma, ten, gioiTinh;
        private Date ngaySinh;
        private String diaChi;

        public KhachHang(int ma, String ten, String gioiTinh, String ngaySinh, String diaChi) throws ParseException {
            this.ma = ((ma < 10) ? "KH00" : "KH0") + ma;
            this.ten = ten;
            this.gioiTinh = gioiTinh;
            this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
            this.diaChi = diaChi;
            chuanHoa();
        }

        private void chuanHoa() {
            String[] s = ten.trim().toLowerCase().split(" +");
            StringTokenizer x = new StringTokenizer(ten);
            StringBuilder result = new StringBuilder();
            for (String i : s) {
                result.append((i.charAt(0) + "").toUpperCase()).append(i.substring(1)).append(" ");
            }
            result.deleteCharAt(result.length() - 1);
            ten = result.toString();
        }

        @Override
        public int compareTo(KhachHang o) {
            return ngaySinh.compareTo(o.ngaySinh);
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + gioiTinh + " " + diaChi + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh);
        }
    }
}
