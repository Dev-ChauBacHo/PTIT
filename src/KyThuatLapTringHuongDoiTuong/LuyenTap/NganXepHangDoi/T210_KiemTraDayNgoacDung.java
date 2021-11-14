package KyThuatLapTringHuongDoiTuong.LuyenTap.NganXepHangDoi;

import java.util.Scanner;
import java.util.Stack;

public class T210_KiemTraDayNgoacDung {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        while (T-- > 0) {
            System.out.println(process(in.nextLine()));
        }
    }

    private static String process(String s) {
        Stack<Character> stack = new Stack<>();
        stack.add('0');
        for (Character c : s.toCharArray()) {
//            System.out.print(c + ": ");
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && stack.peek() == '{') {
                stack.pop();
            } else return "NO";
        }
        if (stack.size() == 1) return "YES";
        else return "NO";
    }
}
