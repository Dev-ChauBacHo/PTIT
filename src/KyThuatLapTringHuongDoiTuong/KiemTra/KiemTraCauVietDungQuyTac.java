package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraCauVietDungQuyTac {

    private static Stack<Character> stack;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        String s;
        while (T-- > 0) {
            s = in.nextLine();
            System.out.println(process(s));
        }
    }

    private static String process(String s) {
        stack = new Stack<>();
        stack.push('0');
        for (char c: s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == '[') {
                stack.push(c);
            } else if (c == ')') {
               if (stack.pop() != '(') return "NO";
            } else if (c == ']') {
                if (stack.pop() != '[') return "NO";
            }
        }
        if (stack.size() > 1) return "NO";
        return "YES";
    }
}
