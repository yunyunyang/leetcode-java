package leetcode.algorithms.medium;

// 48. Rotate Image
public class RotateImage {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        for (int[] row : matrix) {
            reverse(row);
        }
    }

    private void reverse(int[] row) {
        int left = 0, right = row.length - 1;
        while (left < right) {
            int tmp = row[left];
            row[left] = row[right];
            row[right] = tmp;

            left++;
            right--;
        }
    }
}
