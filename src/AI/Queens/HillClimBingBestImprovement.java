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
        int preSaveCol = 0, curSaveCol;

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
        int heuristic = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (isConflict(i, j, state[i], state[j])) {
                    heuristic++;
                }
            }
        }
        return heuristic;
    }

//    private static int changeHeuristic(int[] state, int x, int y) {
//
//    }

    private static boolean isConflict(int x1, int x2, int y1, int y2) {
        //  Check rows and columns
        if (x1 == x2 || y1 == y2)
            return true;
            //  Check diagonals
        else if (Math.abs(x1 - x2) == Math.abs(y1 - y2))
            return true;
        return false;
    }
}
