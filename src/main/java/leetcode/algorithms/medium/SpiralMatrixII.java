package leetcode.algorithms.medium;

// 59. Spiral Matrix II
public class SpiralMatrixII {

    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;

        while (num <= n * n) {
            if (top <= bottom) {
                for (int c = left; c <= right; c++) {
                    result[top][c] = num;
                    num++;
                }
                top++;
            }
            if (left <= right) {
                for (int r = top; r <= bottom; r++) {
                    result[r][right] = num;
                    num++;
                }
                right--;
            }
            if (top <= bottom) {
                for (int c = right; c >= left; c--) {
                    result[bottom][c] = num;
                    num++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int r = bottom; r >= top; r--) {
                    result[r][left] = num;
                    num++;
                }
                left++;
            }
        }
        return result;
    }
}
