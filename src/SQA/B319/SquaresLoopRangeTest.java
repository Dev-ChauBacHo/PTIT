package SQA.B319;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SquaresLoopRangeTest {

    private String captureOutputOfProcess(int start, int stop) {
        OutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        try {
            SquaresLoopRange.process(start, stop);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setOut(originalOut);
        }
        return outputStream.toString().trim();
    }
    @Test
    void test1() {
        // start < stop
        int[] arr = {-3, 10};
        assertEquals("9 4 1 0 1 4 9 16 25 36 49 64 81 100", captureOutputOfProcess(arr[0], arr[1]));
    }

    @Test
    void test2() {
        // start > stop
        int[] arr = {8, 7};
        assertEquals("Start-limit greater than stop-limit!", captureOutputOfProcess(arr[0], arr[1]));
    }

    @Test
    void test3() {
        // start = stop
        int[] arr = {8, 8};
        assertEquals("64", captureOutputOfProcess(arr[0], arr[1]));
    }

    @Test
    void testTinhThue() {

    }

}