package ChuyenDe;

import java.util.Arrays;

public class Other {
    public static void main(String[] args) {

    }

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

    private static boolean cmp(char[] pattern, char[] y) {
        if (pattern.length != y.length) return false;
        for (int i = 0; i < pattern.length; i++) {
            if (pattern[i] != y[i]) {
                return false;
            }
        }
        return true;
    }

    void AXAMAC(char[] x, int m, char[] y, int n) {
        int i, j, k, ell;

        int[] kmpNext = preKMP(x);
        for (ell = 1; x[ell - 1] == x[ell]; ell++)
            if (ell == m)
                ell = 0;

        i = ell;
        j = k = 0;
        while (j <= n - m) {
            while (i < m && x[i] == y[i + j])
                ++i;
            if (i >= m) {
                while (k < ell && x[k] == y[j + k])
                    ++k;
                if (k >= ell)
                    System.out.println(j);
            }
            j += (i - kmpNext[i]);
            if (i == ell)
                k = Math.max(0, k - 1);
            else if (kmpNext[i] <= ell) {
                k = Math.max(0, kmpNext[i]);
                i = ell;
            } else {
                k = ell;
                i = kmpNext[i];
            }
        }
    }

    void NSN(char[] x, int m, char[] y, int n) {
        int j, k, ell;

        /* Preprocessing */
        if (x[0] == x[1]) {
            k = 2;
            ell = 1;
        } else {
            k = 1;
            ell = 2;
        }

        /* Searching */
        j = 0;
        while (j <= n - m)
            if (x[1] != y[j + 1])
                j += k;
            else {
                if (cmp(x, Arrays.copyOfRange(y, j + 2, j + x.length)) &&
                        x[0] == y[j])
                    System.out.println(j);
                j += ell;
            }
    }

    int[] preBmBc(char[] x) {
        int[] bmBc = new int[256];
        int i;
        for (i = 0; i < 256; ++i)
            bmBc[i] = x.length;
        for (i = 0; i < x.length - 1; ++i)
            bmBc[x[i]] = x.length - i - 1;
        return bmBc;
    }


    int[] suffixes(char[] x) {
        int f = 0, g, i;
        int[] suff = new int[x.length];
        suff[x.length - 1] = x.length;
        g = x.length - 1;
        for (i = x.length - 2; i >= 0; --i) {
            if (i > g && suff[i + x.length - 1 - f] < i - g)
                suff[i] = suff[i + x.length - 1 - f];
            else {
                if (i < g)
                    g = i;
                f = i;
                while (g >= 0 && x[g] == x[g + x.length - 1 - f])
                    --g;
                suff[i] = f - g;
            }
        }
        return suff;
    }

    int[] preBmGs(char[] x) {
        int i, j;
        int m = x.length;
        int[] bmGs = new int[x.length];
        int[] suff = suffixes(x);

        for (i = 0; i < m; ++i)
            bmGs[i] = m;
        j = 0;
        for (i = m - 1; i >= 0; --i)
            if (suff[i] == i + 1)
                for (; j < m - 1 - i; ++j)
                    if (bmGs[j] == m)
                        bmGs[j] = m - 1 - i;
        for (i = 0; i <= m - 2; ++i)
            bmGs[m - 1 - suff[i]] = m - 1 - i;
        return bmGs;
    }

    void BM(char[] x, int m, char[] y, int n) {
        int i, j;
        int[] bmGs = preBmGs(x);
        int[] bmBc = preBmBc(x);

        j = 0;
        while (j <= n - m) {
            for (i = m - 1; i >= 0 && x[i] == y[i + j]; --i)
                if (i < 0) {
                    System.out.println(j);
                    j += bmGs[0];
                } else
                    j += Math.max(bmGs[i], bmBc[y[i + j]] - m + 1 + i);
        }
    }


    void TUNEDBM(char[] x, char[] y) {
        int j, k, shift;
        int m = x.length;
        int n = y.length;
        int[] bmBc = preBmBc(x);

        /* Preprocessing */
        shift = bmBc[x[m - 1]];
        bmBc[x[m - 1]] = 0;

        /* Searching */
        j = 0;
        while (j < n) {
            k = bmBc[y[j + m - 1]];
            while (k != 0) {
                j += k;
                k = bmBc[y[j + m - 1]];
                j += k;
                k = bmBc[y[j + m - 1]];
                j += k;
                k = bmBc[y[j + m - 1]];
            }
            if (cmp(x, Arrays.copyOfRange(y, j, y.length)) && j < n)
                System.out.println(j);
            j += shift;
        }
    }

    void TBM(char[] x, char[] y) {
        int m = x.length;
        int n = y.length;
        int bcShift, i, j, shift, u, v, turboShift;

        /* Preprocessing */
        int[] bmGs = preBmGs(x);
        int[] bmBc = preBmBc(x);

        /* Searching */
        j = u = 0;
        shift = m;
        while (j <= n - m) {
            i = m - 1;
            while (i >= 0 && x[i] == y[i + j]) {
                --i;
                if (u != 0 && i == m - 1 - shift)
                    i -= u;
            }
            if (i < 0) {
                System.out.println(j);
                shift = bmGs[0];
                u = m - shift;
            } else {
                v = m - 1 - i;
                turboShift = u - v;
                bcShift = bmBc[y[i + j]] - m + 1 + i;
                shift = Math.max(turboShift, bcShift);
                shift = Math.max(shift, bmGs[i]);
                if (shift == bmGs[i])
                    u = Math.min(m - shift, v);
                else {
                    if (turboShift < bcShift)
                        shift = Math.max(shift, u + 1);
                    u = 0;
                }
            }
            j += shift;
        }
    }

    void HORSPOOL(char[] x, char[] y) {
        int m = x.length;
        int n = y.length;
        int j;
        char c;

        /* Preprocessing */
        int[] bmBc = preBmBc(x);

        /* Searching */
        j = 0;
        while (j <= n - m) {
            c = y[j + m - 1];
            if (x[m - 1] == c && cmp(x, Arrays.copyOfRange(y, j, y.length)))
                System.out.println(j);
            j += bmBc[c];
        }
    }

    void SMITH(char[] x, char[] y) {
        int m = x.length;
        int n = y.length;
        int j = 0;
        int[] bmBc = preBmBc(x);
        int[] qsBc = preQsBc(x);

        /* Searching */
        while (j <= n - m) {
            if (cmp(x, Arrays.copyOfRange(y, j, y.length)))
                System.out.println(j);
            j += Math.max(bmBc[y[j + m - 1]], qsBc[y[j + m]]);
        }
    }

    private int[] preQsBc(char[] pattern) {
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

    void RAITA(char[] x, char[] y) {
        int j;
        int m = x.length;
        int n = y.length;
        char c, firstCh;
        char[] secondCh = Arrays.copyOf(x, x.length);
        int middleCh, lastCh;

        /* Preprocessing */
        int[] bmBc = preBmBc(x);
        firstCh = x[0];
        middleCh = x[m / 2];
        lastCh = x[m - 1];

        /* Searching */
        j = 0;
        while (j <= n - m) {
            c = y[j + m - 1];
            if (lastCh == c && middleCh == y[j + m / 2] &&
                    firstCh == y[j] &&
                    cmp(secondCh, Arrays.copyOfRange(y, j + 1, m - 2)))
                System.out.println(j);
            j += bmBc[c];
        }
    }


}
