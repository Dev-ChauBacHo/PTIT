package KyThuatLapTringHuongDoiTuong.KiemTra;

import java.util.Scanner;
import java.util.Stack;

public class WA_GoBanPhim {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        process(s);
    }

    private static void process(String s) {
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '<') {
                if (!left.isEmpty()) right.push(left.pop());
            } else if (c == '>') {
                if (!right.isEmpty()) left.push(right.pop());
            } else if (c == '-') {
                if (!left.isEmpty()) left.pop();
            } else {
                left.push(c);
            }
        }

        for (Character character : left) {
            System.out.print(character);
        }
        for (Character character : right) {
            System.out.print(character);
        }
    }

}
