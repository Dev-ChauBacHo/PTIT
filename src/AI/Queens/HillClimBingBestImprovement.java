package AI.Queens;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class HillClimBingBestImprovement {
    private static final Scanner reader = new Scanner(System.in);
    private static int n;
    private static int heuristic = 0;
    private static int presentHeuristic;
    private static HashMap<Integer, Integer> diagonalsLeft;
    private static HashMap<Integer, Integer> diagonalsRight;

    public static void main(String[] args) {
        System.out.print("n = ");
        n = reader.nextInt();

        final long startTime = System.nanoTime();

        int[] presentBoard = generate(n);
        presentHeuristic = findHeuristic(presentBoard);
        while (presentHeuristic != 0) {
            presentBoard = nextBoard(presentBoard);
            presentHeuristic = heuristic;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(presentBoard[i] + " ");
        }

        final long duration = System.nanoTime() - startTime;
        System.out.println("\n" + TimeUnit.NANOSECONDS.toSeconds(duration));
    }

    private static int[] nextBoard(int[] presentBoard) {
        int[] nextBoard = new int[n + 1];
        int[] tempBoard = new int[n + 1];
        int tempHeuristic;
        int bestHeuristic = presentHeuristic;
        int curSaveCol;

        for (int i = 1; i <= n; i++) {
            nextBoard[i] = presentBoard[i];
            tempBoard[i] = presentBoard[i];
        }

        for (int i = 1; i <= n; i++) {
            curSaveCol = i;
            for (int j = i + 1; j <= n; j++) {
                if (!isConflict(i, j, tempBoard[i], tempBoard[j])) {
                    int temp = tempBoard[i];
                    tempBoard[i] = tempBoard[j];
                    tempBoard[j] = temp;
                    tempHeuristic = findHeuristic(tempBoard);
                    if (tempHeuristic == 0) {
                        heuristic = 0;
                        return tempBoard;
                    }
                    if (tempHeuristic < bestHeuristic) {
                        bestHeuristic = tempHeuristic;
                        curSaveCol = j;
                        for (int k = 1; k <= n; k++) {
                            nextBoard[k] = tempBoard[k];
                        }
                    }

                    temp = tempBoard[i];
                    tempBoard[i] = tempBoard[j];
                    tempBoard[j] = temp;
                }
            }
            tempBoard[i] = presentBoard[i];
            tempBoard[curSaveCol] = presentBoard[curSaveCol];
        }

        if (bestHeuristic == presentHeuristic) {
            nextBoard = generate(n);
            heuristic = findHeuristic(nextBoard);
        } else
            heuristic = bestHeuristic;

        return nextBoard;
    }

    private static int[] generate(int n) {
        int[] b = new int[n + 1];
        int temp;
        Random random = new Random();
        Set<Integer> col = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            do {
                temp = random.nextInt(n) + 1;
            } while (col.contains(temp));
            b[i] = temp;
            col.add(temp);
        }
        return b;
    }

    public static int findHeuristic(int[] state) {
        int heuristic = 0, x;
        diagonalsLeft.put(1, 0);
        diagonalsLeft.put(2 * n - 1, 0);
        diagonalsRight.put(n, 0);
        diagonalsRight.put(-n, 0);

        for (int i = 1; i <= n; i++) {

            x = diagonalsLeft.getOrDefault(i + state[i] - 1, 0);
            diagonalsLeft.put(i + state[i] - 1, ++x);

            x  = diagonalsRight.getOrDefault(state[i] - i + 1, 0);
            diagonalsRight.put(state[i] - i + 1, ++x);
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> entry: diagonalsLeft.entrySet()) {
            if (entry.getValue() == 1) {
                ++count;
            }
        }



//        for (int i = 1; i < n; i++) {
//            for (int j = i + 1; j <= n; j++) {
//                int a = i - j;
//                int b = state[i] - state[j];
//                if (Math.abs(a) == Math.abs(b)) {
//                    if (a * b < 0) {
//                        x = diagonalsLeft.getOrDefault(i + state[i] - 1, 0);
//                        diagonalsLeft.put(i + state[i] - 1, ++x);
//                    } else {
//                        x  = diagonalsRight.getOrDefault(state[i] - i + 1, 0);
//                        diagonalsRight.put(state[i] - i + 1, ++x);
//                    }
//                    ++heuristic;
//                }
//            }
//        }


        return heuristic;
    }

    private static boolean changeHeuristic(int x1, int y1, int x2, int y2) {
        int a1 = diagonalsLeft.get(x1 + y1 - 1);
        int b1 = diagonalsRight.get(y1 - x1 + 1);
        if (a1 == 0 || b1 == 0) return false;

        int a2 = diagonalsLeft.get(x2 + y2 - 1);
        int b2 = diagonalsRight.get(y2 - x2 + 1);
        if (a2 == 0 || b2 == 0) return false;

        diagonalsLeft.put(x1 + y1 - 1, --a1);
        diagonalsRight.put(y1 - x1 + 1, --b1);
        if (a1 == 1) ++heuristic;
        else --heuristic;

        diagonalsLeft.put(x2 + y2 - 1, --a2);
        diagonalsRight.put(y2 - x2 + 1, --b2);

        diagonalsLeft.put(x1 + y2 - 1, 1 + diagonalsLeft.getOrDefault(x1 + y2 - 1, 0));
        diagonalsRight.put(y2 - x1 + 1, 1 + diagonalsRight.getOrDefault(y2 - x1 + 1, 0));

        diagonalsLeft.put(x2 + y1 - 1, 1 + diagonalsLeft.getOrDefault(x2 + y1 - 1, 0));
        diagonalsRight.put(y1 - x2 + 1, 1 + diagonalsRight.getOrDefault(y1 - x2 + 1, 0));

        return true;
    }

    private static void afterSwap(int a) {}
    

    private static boolean isConflict(int x1, int x2, int y1, int y2) {
            //  Check diagonals
        return Math.abs(x1 - x2) == Math.abs(y1 - y2);
    }
}
