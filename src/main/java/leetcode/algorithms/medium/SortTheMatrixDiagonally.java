package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 1329. Sort the Matrix Diagonally
public class SortTheMatrixDiagonally {

    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Map<Integer, ArrayList<Integer>> diagonals = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                diagonals.putIfAbsent(key, new ArrayList<>());
                diagonals.get(key).add(mat[i][j]);
            }
        }

        for (List<Integer> diagonal : diagonals.values()) {
            diagonal.sort(Collections.reverseOrder());
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ArrayList<Integer> diagonal = diagonals.get(i - j);
                mat[i][j] = diagonal.remove(diagonal.size() - 1);
            }
        }

        return mat;
    }
}
