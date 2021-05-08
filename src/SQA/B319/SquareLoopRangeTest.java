package SQA.B319;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class SquareLoopRangeTest {
    private String captureOutputOfMain(String args[]) {
        OutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        try {
            SquaresLoopRange.main(args);
        } catch (Exception e) {

        } finally {
            System.setOut(originalOut);
        }
        return outputStream.toString().trim();
    }
}
