package ChuyenDe.LeftToRight;

public class QuickSearch {

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
        int[] preBc = preQsBc(pattern);
        int i = 0;
        /*
            Chỉ tính đến slength - xlength do nao ta sẽ cho sánh
            pattern với đoạn từ (slength - xlength) đến slength của s
         */
        while (i <= slength - xlength) {
            // So sánh xem có giống nhau không
            if (cmp(pattern, s, i)) {
                System.out.println(i);
            }
            // Dịch sang phải
            i = i + preBc[s[i + xlength]];
        }
    }

    // Tìm vị trí cuối cùng xuất hiện của 1 kí tự trong xâu pattern
    public static int[] preQsBc(char[] pattern) {
        // Khỏi tạo xâu gồm đầy đủ 256 kí tự
        int[] bc = new int[255];
        int xlength = pattern.length;
        /*
             Mặc định cho các kí tự xuất hiện ở cuối xâu,
             có ý nghĩa tương tự như chưa xuất hiện.
             Sau sẽ dùng để dịch sang phải, nếu không xuất hiện
             thì sẽ dịch cả xâu luôn.
         */
        for (int i = 0; i < 255; i++) {
            bc[i] = xlength + 1;
        }
        /*
            Xét các kí tự xuất hiện: thì tìm vị trí cuối cùng nó xuất hiện
         */
        for (int i = 0; i < xlength; i++) {
            /*
                xlength - i là vị trí xuất hiện tính từ bên phải,
                Ví dụ bc[65] = 4, tức kí tự A xuất hiện cuối cùng tại
                vị trí thứ 4 tính từ bên phải
             */
            bc[pattern[i]] = xlength - i;
            System.out.println(pattern[i] + " " + (int) pattern[i] + " " + bc[pattern[i]] + " " + xlength + " " + i);
        }
        return bc;
    }


    // So sánh pattern với 1 đoạn trong s tính từ i
    public static boolean cmp(char[] pattern, char[] s, int i) {
        for (char c : pattern) {
            if (c != s[i++]) {
                return false;
            }
        }
        // Chỉ khi trùng hết mới return true
        return true;
    }
}
