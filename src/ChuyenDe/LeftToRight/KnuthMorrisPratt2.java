package ChuyenDe.LeftToRight;

public class KnuthMorrisPratt2 {

    public static void main(String[] args) {
        String x = "ABABCABAB";
        String y = "ABABDABACDABABCABAB";
//        String x = "GCAGAGAG";
//        String y = "GCATCGCAGAGAGTATACAGTACG";

        search(x.toCharArray(), y.toCharArray());
    }

    private static void search(char[] pattern, char[] s) {
        int xlength = pattern.length;
        int slength = s.length;
        int[] kmpNext = preKMP(pattern);
        int i = 0;
        int j = 0;

//        System.out.println(Arrays.toString(kmpNext));

        while (i < slength) {
            System.out.println(i + " " + j + " " + pattern[j] + " " + s[i]);
            if (pattern[j] == s[i]) {
                ++i;
                ++j;
            }
            if (j == xlength) {
                System.out.println(i - j);
                j = kmpNext[j - 1];
            } else if (i < slength && pattern[j] != s[i]) {
                if (j != 0) {
                    j = kmpNext[j - 1];
                } else ++i;
            }
        }
    }

    // kmpNext lưu lại số kí tự mà kí tự n trong pattern giống với kí tự tính từ đầu xâu
    private static int[] preKMP(char[] pattern) {
        int xlength = pattern.length;
        int[] kmpNext = new int[xlength];
        int i = 1;
        int j = 0;
        kmpNext[0] = 0;
        while (i < xlength) {
//            System.out.print(i + " ");
            // Nếu thấy có kí tự giống nhau tính từ đầu xâu
            if (pattern[i] == pattern[j]) {
                // Tăng j là lưu số kí tự giống
                ++j;
                // Lưu vào kmpNext[i]
                kmpNext[i] = j;
                // Xét tiếp kí tự tiếp theo
                ++i;
            } else {    // Nếu 2 kí tự không bằng nhau
                // Mà j > 0, tức là kmpNext[j-1] đã lưu 1 vị trí nào đó rồi
                if (j != 0) {
                    // Cập nhật lại j, (j-1) là vì j không giống thì phải xét (j-1)
                    j = kmpNext[j - 1];
                } else {    // Nếu j = 0, tức vẫn ở đầu xâu
                    // Thì ta xét tiếp vị trí i+1, vị trí i là kmpNext[i] = 0 do không giống
                    kmpNext[i] = 0;
                    ++i;
                }
            }
        }
        return kmpNext;
    }
}
