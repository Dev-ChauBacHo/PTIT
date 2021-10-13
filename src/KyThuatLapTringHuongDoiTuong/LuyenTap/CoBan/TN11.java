package KyThuatLapTringHuongDoiTuong.LuyenTap.CoBan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TN11 {

    private static int b[], N;
    private static String s;
    private static ArrayList<String> result;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        while (T-- > 0) {
            b = new int[30];
            result = new ArrayList<>();
            N = Integer.parseInt(in.nextLine());
            s = in.nextLine();
            backstack(1);
            Collections.sort(result);
            for (String r : result) System.out.print(r + " ");
            System.out.println();
        }
    }

    private static void backstack(int i) {
        for (int j = 0; j <= 1; j++) {
            b[i] = j;
            if (i == N) process();
            else backstack(i + 1);
        }
    }

    private static void process() {
        StringBuilder temp = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            if (b[i] == 1) temp.append(s.charAt(i - 1));
        }
        if (!temp.toString().isEmpty()) result.add(temp.toString());
    }
}
