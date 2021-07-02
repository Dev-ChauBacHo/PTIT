package ChuyenDe.LeftToRight;

import java.util.Arrays;

public class KnuthMorrisPratt {

    public static void main(String[] args) {
//        String x = "ABABCABAB";
        String x = "GCAGAGAG";
        String y = "GCATCGCAGAGAGTATACAGTACG";

        search(x.toCharArray(), y.toCharArray());
    }

    private static void search(char[] pattern, char[] s) {
        int xlength = pattern.length;
        int slength = s.length;
        int[] kmpNext = preKMP(pattern);
        int i = 0;// the position of character in x
        int j = 0;// the beginning of the current match in y

        System.out.println(Arrays.toString(kmpNext));

        while (j < slength) {
            while (i > -1 && pattern[i] != s[j])
                i = kmpNext[i];
            i++;
            j++;
            if (i >= xlength) {
                System.out.println(j - xlength);
                i = kmpNext[i];
            }
        }

    }

    private static int[] preKMP(char[] pattern) {
        int xlength = pattern.length;
        int[] kmpNext = new int[xlength + 1];
        int i = 0;
        int j = -1;
        kmpNext[0] = -1;
        while (i < xlength - 1) {
            while (j > -1 && pattern[i] != pattern[j]) {
                j = kmpNext[j];
            }
            i++;
            j++;
            if (pattern[i] == pattern[j]) {
                kmpNext[i] = kmpNext[j];
            } else {
                kmpNext[i] = j;
            }
        }
        return kmpNext;
    }
}
