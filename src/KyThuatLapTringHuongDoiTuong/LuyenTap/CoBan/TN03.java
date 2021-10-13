package KyThuatLapTringHuongDoiTuong.LuyenTap.CoBan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TN03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T;
        String s;
        T = in.nextInt();
        in.nextLine();
        while (T-- > 0) {
            s = in.nextLine();
            char[] c = s.toCharArray();
            ArrayList<Character> letters = new ArrayList<>();
            int sum = 0;

            for (char character : c) {
                if (character >= 'A' && character <= 'Z') {
                    letters.add(character);
                } else {
                    sum += Integer.parseInt(String.valueOf(character));
                }
            }
            if (!letters.isEmpty()) Collections.sort(letters);
            for (char chars: letters) {
                System.out.print(chars);
            }
            System.out.println(sum);
        }
    }
}
