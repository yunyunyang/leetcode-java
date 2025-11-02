package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;

// 54. Spiral Matrix
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        List<Integer> result = new ArrayList<>();
        while (result.size() < rows * cols) {
            if (top <= bottom) {
                for (int c = left; c <= right; c++) {
                    result.add(matrix[top][c]);
                }
                top++;
            }
            if (left <= right) {
                for (int r = top; r <= bottom; r++) {
                    result.add(matrix[r][right]);
                }
                right--;
            }
            if (top <= bottom) {
                for (int c = right; c >= left; c--) {
                    result.add(matrix[bottom][c]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int r = bottom; r >= top; r--) {
                    result.add(matrix[r][left]);
                }
                left++;
            }
        }
        return result;
    }
}
