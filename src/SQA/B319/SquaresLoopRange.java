package SQA.B319;

import org.junit.jupiter.api.Test;

public class SquaresLoopRange {
    public static void main(String[] args) {
        int start, stop;
        try {
            start = Integer.parseInt(args[0]);
            stop = Integer.parseInt(args[1]);
            process(start, stop);
        } catch (Exception e) {
            System.out.println("Wrong format for integer number");
        }
    }

    public static void process(int start, int stop) {
        if (start <= stop) {
            for (int i = start; i <= stop; i++) {
                System.out.print((i * i) + " ");
            }
        } else {
            System.out.println("Start-limit greater than stop-limit!");
        }
    }
}
