package KyThuatLapTringHuongDoiTuong.LuyenTap.CoBan;

import java.util.Scanner;

public class TN08_XauNhiPhanKeTiep {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T;
        String s;
        T = Integer.parseInt(in.nextLine());
        while (T-- > 0) {
            s = in.nextLine();
            int[] result = new int[1001];
            boolean hasSurplus = true;
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == '1') {
                    if (hasSurplus) {
                        result[i] = 0;
                    } else {
                        result[i] = 1;
                    }
                } else {
                    if (hasSurplus) {
                        hasSurplus = false;
                        result[i] = 1;
                    } else {
                        result[i] = 0;
                    }
                }
            }
            for (int i = 0; i < s.length(); i++) System.out.print(result[i]);
            System.out.println();
        }
    }
}
