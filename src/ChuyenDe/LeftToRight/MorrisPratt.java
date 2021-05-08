package ChuyenDe.LeftToRight;

import java.util.Arrays;

public class MorrisPratt {
    // tim kiem cac vi tri cua x trong y
    // m: là vị trí tương ứng trên y bắt đầu 1 phép so sánh với x
    // mpNext[i] duoc dinh nghi la so phan tu quay nguoc lai de so sanh
    // ke tu vi tri i tren y khi ma y[m+i] khong khop voi x[i]
    public static int[] preMP(char[] x) {
        int[] mpNext = new int[x.length + 1];
        int i = 0;
        int j = mpNext[0] = -1;
        while (i < x.length) {
            System.out.println(i + " " + j);
            while (j > -1 && (x[i] != x[j])) {
                j = mpNext[j];
                System.out.println("===>" + j);
            }
            mpNext[++i] = ++j;
        }
        return mpNext;
    }

    public static void search(char[] x, char[] y) {
        int[] mpNext = preMP(x);
        System.out.println(Arrays.toString(mpNext));
        System.out.println("[ 0, 1, 2, 3, 4, 5, 6, 7, 8]");
        int posX = 0;// the position of character in x
        int posY = 0;// the beginning of the current match in y
        System.out.println("Các vị trí xuất hiện của x trong y là: ");
        while (posY <= y.length - x.length) {
            if (x[posX] == y[posY + posX]) {
                posX++;
                if (posX == x.length) {
                    System.out.print(posY + "    ");
                    posY = posY + posX - mpNext[posX];
                    posX = 0;
                }
            } else {
                posY = posY + posX - mpNext[posX];
                if (posX > 0) {
                    posX = mpNext[posX];
                }
            }
        }
    }

    public static void main(String[] args) {
        String x = "GCAGCAGCA";
        char[] X = x.toCharArray();
        String y = "GCATCGCAGCABAGTATACAGTACG";
        char[] Y = y.toCharArray();
        System.out.println(y.replace("", ", "));
        System.out.println(x.replace("", ", "));
        search(X, Y);
    }
}
