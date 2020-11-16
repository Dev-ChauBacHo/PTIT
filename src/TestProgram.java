import java.util.Scanner;

public class TestProgram {
    public static void main(String[] args) {
        while (true) {
            String s = (new Scanner(System.in)).nextLine();
            String[] arr = s.split("/");
            StringBuilder result = new StringBuilder();
            for (int i = arr.length - 1; i >= 0; i--) {
                result.append(arr[i]);
                if (i != 0) result.append("-");
            }
            System.out.println(result);
        }
    }
}
