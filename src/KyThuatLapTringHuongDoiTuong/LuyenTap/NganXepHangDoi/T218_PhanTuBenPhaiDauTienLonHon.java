package KyThuatLapTringHuongDoiTuong.LuyenTap.NganXepHangDoi;

import java.util.Scanner;
import java.util.Stack;

public class T218_PhanTuBenPhaiDauTienLonHon {
    private static int n;
    private static int[] arr;
    private static Stack<Number> stack;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            n = in.nextInt();
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            stack = new Stack<>();
            process();
        }
    }

    private static void process() {
        Number t;
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] > stack.peek().value) {
                t = stack.pop();
                arr[t.index] = arr[i];
            }
            stack.push(new Number(i, arr[i]));
        }

        while (!stack.isEmpty()) {
            t = stack.pop();
            arr[t.index] = -1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static class Number {
        int index, value;

        public Number(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}
