package KyThuatLapTringHuongDoiTuong.LuyenTap.NganXepHangDoi;

import java.util.Scanner;

public class TN30_BieuThucDung {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        String s;
        while (T-- > 0) {
            s = in.nextLine();
            process(s);
        }
    }

    private static void process(String s) {
        int open = 0;
        int close = 0;
        int result = 0;
        for (char c : s.toCharArray()) {
            if (c == '[') {
                if (close == 0) {
                    ++open;
                } else {
                    result += close;
                    --close;
                }
            } else if (c == ']') {
                if (open == 0) {
                    ++close;
                } else {
                    --open;
                }
            }
        }
        System.out.println(result);
    }
}
