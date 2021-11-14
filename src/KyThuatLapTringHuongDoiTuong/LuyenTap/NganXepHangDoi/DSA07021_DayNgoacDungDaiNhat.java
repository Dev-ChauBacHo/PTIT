package KyThuatLapTringHuongDoiTuong.LuyenTap.NganXepHangDoi;

import java.util.Scanner;
import java.util.Stack;

public class DSA07021_DayNgoacDungDaiNhat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        while (T-- > 0) {
            System.out.println(process(in.nextLine()));
        }
    }

    private static int process(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.add(-1);
        int max = 0;
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    max = Math.max(max, i - stack.peek());
                }
//                System.out.println(count);
            }
        }
        return max;
    }
}
