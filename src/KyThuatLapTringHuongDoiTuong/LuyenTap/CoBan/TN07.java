package KyThuatLapTringHuongDoiTuong.LuyenTap.CoBan;

import java.util.ArrayList;
import java.util.Scanner;

public class TN07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        s = in.nextLine();
        ArrayList<Character> result = new ArrayList<>();
        for (char c : s.toCharArray()) {
            result.add(c);
        }
        int i = 0;
        do {
            if (result.get(i) == result.get(i + 1)) {
                result.remove(i);
                result.remove(i);
                if (i > 0) --i;
            } else ++i;
        } while (i < result.size() - 1);
        if (result.isEmpty()) System.out.println("Empty String");
        for (Character c: result) System.out.print(c);
    }
}
