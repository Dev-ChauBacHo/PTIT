package ChuyenDe.SpecificOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SkipSearch {

    public static void main(String[] args) {
        String x = "GCAGAGAG";
        String y = "GCATCGCAGAGAGTATACAGTACG";

        search(x.toCharArray(), y.toCharArray());
    }

    private static void search(char[] pattern, char[] s) {
        HashMap<Character, List<Integer>> allPositions = findAllAvailablePosition(pattern);
        System.out.println(allPositions);
        int xlength = pattern.length;
        int slength = s.length;

        for (int i = xlength - 1; i < slength; i = i + xlength) {
            if (allPositions.containsKey(s[i])) {
                for (int j : allPositions.get(s[i])) {
                    if (cmp(pattern, s, j)) {
                        System.out.println(i - j);
                    }
                }
            }
        }
    }

    private static HashMap<Character, List<Integer>> findAllAvailablePosition(char[] pattern) {
        HashMap<Character, List<Integer>> allPositions = new HashMap<>();
        for (int i = 0; i < pattern.length; i++) {
            List<Integer> positions;
            char c = pattern[i];
            if (allPositions.containsKey(c)) {
                positions = allPositions.get(c);
            } else {
                positions = new ArrayList<>();
                allPositions.put(pattern[i], positions);
            }
            positions.add(i);
        }
        return allPositions;
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
