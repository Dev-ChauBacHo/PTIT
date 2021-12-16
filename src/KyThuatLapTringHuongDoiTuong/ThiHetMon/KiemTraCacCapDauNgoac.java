package KyThuatLapTringHuongDoiTuong.ThiHetMon;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraCacCapDauNgoac {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        String s;
        Stack<Character> stack;
        boolean check;
        while (T-- > 0) {
            stack = new Stack<>();
            s = in.nextLine();
            stack.push('o');
            check = true;
            for (char c : s.toCharArray()) {
                if (c == '[') {
                    stack.push(c);
                } else if (c == '(') {
                    stack.push(c);
                } else if (c == '{') {
                    stack.push(c);
                } else if (c == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        check = false;
                        break;
                    }
                } else if (c == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        check = false;
                        break;
                    }
                } else if (c == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        check = false;
                        break;
                    }
                }
            }
            if (stack.size() > 1) check = false;
            System.out.println(check);
        }
    }
}
/*
2
[()]{}{[()()]()}
[(])
 */
