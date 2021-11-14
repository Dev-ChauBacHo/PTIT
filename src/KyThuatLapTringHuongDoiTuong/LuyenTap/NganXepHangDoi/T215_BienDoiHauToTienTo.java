package KyThuatLapTringHuongDoiTuong.LuyenTap.NganXepHangDoi;

import java.util.Scanner;
import java.util.Stack;

public class T215_BienDoiHauToTienTo {

    private static Stack<String> stack;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        String s;
        while (T-- > 0) {
            s = in.nextLine();
            stack = new Stack<>();
            process(s);
        }
    }

    private static void process(String s) {
        char c;
        String o, o1, o2;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (!isOperator(c)) {
                stack.push(c + "");
            } else {
                o1 = stack.pop();
                o2 = stack.pop();
                o = c + o2 + o1;
                stack.push(o);
            }
        }
        System.out.println(stack.peek());
    }

    private static boolean isOperator(char c) {
        return c == '+' ||
                c == '-' ||
                c == '*' ||
                c == '/' ||
                c == '%' ||
                c == '^';
    }
}
