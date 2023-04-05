package Grouptest1set1;

import java.util.*;

public class resetMatrix {
    public static void makeRowsCols0(int[][] input) {
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;
        int m = input.length;
        int n = input[0].length;

        // check if the first row has a zero
        for (int j = 0; j < n; j++) {
            if (input[0][j] == 0) {
                firstRowHasZero = true;
                break;
            }
        }

        // check if the first column has a zero
        for (int i = 0; i < m; i++) {
            if (input[i][0] == 0) {
                firstColHasZero = true;
                break;
            }
        }

        // mark zeros on the first row and column
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (input[i][j] == 0) {
                    input[i][0] = 0;
                    input[0][j] = 0;
                }
            }
        }

        // set zeros on the rest of the matrix
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (input[i][0] == 0 || input[0][j] == 0) {
                    input[i][j] = 0;
                }
            }
        }

        // set zeros on the first row and column if necessary
        if (firstRowHasZero) {
            for (int j = 0; j < n; j++) {
                input[0][j] = 0;
            }
        }

        if (firstColHasZero) {
            for (int i = 0; i < m; i++) {
                input[i][0] = 0;
            }
        }
    }
}

