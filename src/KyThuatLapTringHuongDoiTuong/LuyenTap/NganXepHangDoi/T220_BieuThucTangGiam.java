package KyThuatLapTringHuongDoiTuong.LuyenTap.NganXepHangDoi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class T220_BieuThucTangGiam {
    private static Stack<Integer> stack;
    private static ArrayList<Integer> numbers;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        while (T-- > 0) {
            System.out.println(process(in.nextLine()));
        }
    }

    private static String process(String s) {
        stack = new Stack<>();
        numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        char c;
        int countI = 0;
        int countD = 0;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == 'I') {
                if (i > 0 && s.charAt(i-1) == 'I') {
                    ++countI;
                } else {
                    stack = new Stack<>();
                    while (countD-- > 0) {
                        stack.add(numbers.get(0));
                        numbers.remove(0);
                    }

                    countI = 1;
                    countD = 0;

                }
            } else {
                if (i > 0 && s.charAt(i-1) == 'D') {
                    ++countD;
                } else {
                    countD = 1;
                    countI = 0;

                }
            }
        }
        return  "";
    }
}
