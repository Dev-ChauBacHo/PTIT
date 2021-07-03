package ChuyenDe.LeftToRight;

import java.util.Arrays;

public class MorrisPratt2 {

    public static void main(String[] args) {
        String x = "ABCGABCDABC";
//        String x = "GCAGAGAG";
        String y = "GCATCGCAGAGAGTATACAGTACG";

        search(x.toCharArray(), y.toCharArray());
    }

    private static void search(char[] pattern, char[] s) {
        int[] mpNext = preMP(pattern);
        System.out.println(Arrays.toString(mpNext));

        int posX = 0;
        int posY = 0;
        while (posY <= s.length - pattern.length) {
            // Nếu có kí tự giống nhau (tính từ kí tự đầu của pattern)
            if (s[posY + posX] == pattern[posX]) {
                // Tăng posX để xét kí tự tiếp
                ++posX;
                // Nếu giống với cả pattern.length kí tự thì có kết quả
                if (posX == pattern.length) {
                    System.out.println("Position: " + posY);
                    // Tiếp tục xét, cho posY nhảy k bước
                    // với k thỏa mãn pattern[k] = pattern[0]
                    // do đó k = posX - mpNext[posX]
                    posY += posX - mpNext[posX];
                    posX = 0;
                }
            } else {
                // posY nhảy k bước
                posY += posX - mpNext[posX];
                if (posX > 0)
                    posX = mpNext[posX];
            }
        }
    }

    private static int[] preMP(char[] pattern) {
        // arr lưu lại vị trí (bắt đầu từ 0) mà kí tự n trong pattern giống với kí tự tính từ đầu xâu
        int[] arr = new int[pattern.length + 1];
        int i = 0;
        // j là vị trí mà n giống
        int j = -1;
        arr[0] = -1;
        while (i < pattern.length) {
            // khi pattern[i] != pattern[j] (ko tinh vi tri dau tien)
            while (j != -1 && (pattern[i] != pattern[j])) {
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
