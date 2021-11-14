package KyThuatLapTringHuongDoiTuong.LuyenTap.NganXepHangDoi;

import java.util.Scanner;
import java.util.Stack;

public class T216_TinhGiaTriBieuThucHauTo {

    private static Stack<Long> stack;

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
        long t = 0, o1, o2;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
//            System.out.println(c);
            if (!isOperator(c)) {
//                System.out.println("--" + c);
                stack.push(Long.parseLong(c + ""));
            } else {
                o1 = stack.pop();
                o2 = stack.pop();
                switch (c) {
                    case '+':
                        t = o1 + o2;
                        break;
                    case '-':
                        t = o2 - o1;
                        break;
                    case '*':
                        t = o1 * o2;
                        break;
                    case '/':
                        t = o2 / o1;
                        break;
                    case '%':
                        t = o2 % o1;
                        break;
                    case '^':
                        t = (long) Math.pow(o2, o1);
                        break;
                }
                stack.push(t);
            }
        }
        System.out.println(stack.peek());
//        System.out.println(stack.peek().toString().split("\\.")[0]);
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
