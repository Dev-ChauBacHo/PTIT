package ChuyenDe.LeftToRight;

public class TunedBoyerMoore {

    public static void main(String[] args) {
//        String x = "ABABCABAB";
//        String y = "ABABDABACDABABCABAB";
        String x = "GCAGAGAG";
        String y = "GCATCGCAGAGAGTATACAGTACG";

        search(x.toCharArray(), y.toCharArray());
    }

    private static void search(char[] pattern, char[] s) {
        int xlength = pattern.length;
        int slength = s.length;
        int[] preBc = preBc(pattern);
        int shift = preBc[pattern[xlength - 1]];
        preBc[pattern[xlength - 1]] = 0;
        System.out.println(pattern[xlength - 1]);
        int i = 0;
        int k;
        while (i <= slength - xlength) {
            k = preBc[s[i + xlength - 1]];
            while (k != 0) {
                i += k;
                k = preBc[s[i + xlength - 1]];
                i += k;
                k = preBc[s[i + xlength - 1]];
                i += k;
                k = preBc[s[i + xlength - 1]];
            }
            if (cmp(pattern, s, i)) {
                System.out.println(i);
            }
            i += shift;
        }
    }

    private static int[] preBc(char[] pattern) {
        int[] bc = new int[255];
        int xlength = pattern.length;
        for (int i = 0; i < 255; i++) {
            bc[i] = xlength;
        }
        for (int i = 0; i <= xlength - 1; i++) {
            bc[pattern[i]] = xlength - i - 1;
        }
        for (int i = 0; i < 255; i++) {
            if (bc[i] != xlength) {
                System.out.println((char) i + " " + bc[i]);
            }
        }
        return bc;
    }

    // So sánh pattern với 1 đoạn trong s tính từ i
    private static boolean cmp(char[] pattern, char[] s, int i) {
        for (char c : pattern) {
            if (c != s[i++]) {
                return false;
            }
        }
        // Chỉ khi trùng hết mới return true
        return true;
    }
}
