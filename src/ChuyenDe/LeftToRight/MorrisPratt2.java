package ChuyenDe.LeftToRight;

import java.util.Arrays;

public class MorrisPratt2 {

    public static void main(String[] args) {
        String x = "GCAGCAGAG";
        char[] X = x.toCharArray();
        String y = "GCATCGCAGCAGAGTATACAGTACG";
        char[] Y = y.toCharArray();
        System.out.println(y.replace("", ", "));
        System.out.println(x.replace("", ", "));
        search(X, Y);
    }

    private static void search(char[] x, char[] y) {
        int[] arr = preMP(x);
        System.out.println(Arrays.toString(arr));

        int posX = 0;
        int posY = 0;
        while (posY <= y.length - x.length) {
            // Nếu có kí tự giống nhau (tính từ kí tự đầu của x)
            if (y[posY + posX] == x[posX]) {
                // Tăng posX để xét kí tự tiếp
                ++posX;
                // Nếu giống với cả x.length kí tự thì có kết quả
                if (posX == x.length) {
                    System.out.println("Position: " + posY);
                    // Tiếp tục xét, cho posY nhảy k bước
                    // với k thỏa mãn x[k] = x[0]
                    // do đó k = posX - arr[posX]
                    posY += posX - arr[posX];
                    posX = 0;
                }
            } else {
                // posY nhảy k bước
                posY += posX - arr[posX];
                if (posX > 0)
                    posX = arr[posX];
            }
        }
    }

    private static int[] preMP(char[] x) {
        // arr lưu lại vị trí mà kí tự n trong x giống với kí tự tính từ đầu xâu
        int[] arr = new int[x.length + 1];
        int i = 0;
        // j là vị trí mà n giống
        int j = -1;
        arr[0] = -1;
        while (i < x.length) {
            // khi x[i] != x[j] (ko tinh vi tri dau tien)
            while (j != -1 && (x[i] != x[j])) {
                // thì j được cập nhật lại = vị trí mà arr[j] giống
                j = arr[j];
            }
            arr[++i] = ++j;
        }
        return arr;
        /*
        VD: Với xâu:    G, C, A, G, C, A, G, A, G
        Ta có arr = -1, 0, 0, 0, 1, 2, 3, 4, 0, 1;
        thì -1 tức là khởi tạo
        0 tức là không giống
        1 là giống với vị trí đầu
        3 tức là giống đến vị trí thứ 3
         */
    }
}
