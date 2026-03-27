package leetcode.algorithms.easy;

import java.util.Arrays;

// 2946. Matrix Similarity After Cyclic Shifts
public class MatrixSimilarityAfterCyclicShifts {

    public boolean areSimilar(int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;
        k %= cols;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (mat[r][c] != mat[r][(c + k) % cols])
                    return false;
            }
        }
        return true;
    }
}
