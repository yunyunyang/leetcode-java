package leetcode.algorithms.medium;

import java.util.HashMap;
import java.util.Map;

// 2661. First Completely Painted Row or Column
public class FirstCompletelyPaintedRowOrColumn {

    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        Map<Integer, int[]> position = new HashMap<>();
        int[] rowCount = new int[rows];
        int[] colCount = new int[cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int key = mat[r][c];
                position.put(key, new int[] {r, c});
                rowCount[r] += 1;
                colCount[c] += 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int[] curr = position.get(arr[i]);
            rowCount[curr[0]] -= 1;
            colCount[curr[1]] -= 1;
            if (rowCount[curr[0]] == 0 || colCount[curr[1]] == 0) {
                return i;
            }
        }
        return 0;
    }
}
