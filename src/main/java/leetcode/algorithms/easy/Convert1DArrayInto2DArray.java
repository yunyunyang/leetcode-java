package leetcode.algorithms.easy;

// 2022. Convert 1D Array Into 2D Array
public interface Convert1DArrayInto2DArray {

    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[0][0];
        }

        int[][] output = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                output[i][j] = original[i * n + j];
            }
        }
        return output;
    }
}
