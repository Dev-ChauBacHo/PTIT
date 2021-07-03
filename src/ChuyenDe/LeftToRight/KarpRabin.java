package ChuyenDe.LeftToRight;

import java.util.Arrays;

/*
    let say pattern has the length of xlength
 */
public class KarpRabin {
    public static void main(String[] args) {
        String x = "GCAGAGAG";
        String y = "GCATCGCAGAGAGTATACAGTACG";

        search(x.toCharArray(), y.toCharArray());
    }

    private static void search(char[] pattern, char[] s) {
        int xlength = pattern.length;
        // compute the hash of pattern
        int hx = hash(pattern);
        char[] y = Arrays.copyOfRange(s, 0, xlength);
        // compute the hash of the fish xlength char in s
        int hy = hash(y);

        if (hx == hy) {
            System.out.println("position: " + 0);
        }
        int preHash = hy;
        // keep compute hash of every xlength char in s
        // start from s[1] because we will subtract the hash for s[0]
        // every loop, when compare chars from s[i] to s[i+xlength-1]
        // we passs s[i-1] to subtract s[i-1]
        for (int i = 1; i <= s.length - xlength; i++) {
            int currentHash = rehash(s[i - 1], s[i + xlength - 1], preHash, xlength);
//            System.out.println("y[" + i + ",..." + (i + xlength - 1) + "] " + currentHash);
            if (hx == currentHash) {
                System.out.println("positon= " + i);
            }
            preHash = currentHash;
        }
    }

    private static int rehash(char theLastPreChar, char newChar, int preHash, int xlength) {
        // subtract the preHash for theLastPreChar
        int result = (int) (preHash - theLastPreChar * Math.pow(2, xlength - 1));
        // Multiplier to 2
        result *= 2;
        // add to the newChar
        result += newChar;
        return result;
    }

    private static int hash(char[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += (int) (arr[i] * Math.pow(2, arr.length - i - 1));
//            System.out.print("(2^" + (arr.length - i - 1) + ")*" + (int)arr[i] + " + ");
        }
//        System.out.println();
        return result;
    }

}
