package KyThuatLapTringHuongDoiTuong.LuyenTap.NganXepHangDoi;

import java.util.Scanner;
import java.util.Stack;

public class T214_BienDoiTienToHauTo {
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
        String o;
        for (int i = s.length() - 1; i >= 0; i--) {
            c = s.charAt(i);
            if (!isOperator(c)) {
                stack.push(c + "");
            } else {
                o = stack.pop() + stack.pop() + c;
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
