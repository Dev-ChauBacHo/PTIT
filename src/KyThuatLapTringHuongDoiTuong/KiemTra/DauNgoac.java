package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.util.Scanner;
import java.util.Stack;

public class DauNgoac {
    private static Stack<Integer> stack;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        while (T-- > 0) {
            stack = new Stack<>();
            process(in.nextLine());
            System.out.println();
        }
    }

    private static void process(String s) {
        int count = 0;
        stack.push(1);
        for (char c : s.toCharArray()) {
            if (c == '(') {
                ++count;
                stack.push(count);
                System.out.print(count + " ");
            } else if (c == ')') {
                System.out.print(stack.pop() + " ");
            }
        }
    }
}
