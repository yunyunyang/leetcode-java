package leetcode.algorithms.medium;

// 74. Search a 2D Matrix
public class SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = m * n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (get(matrix, mid) < target) {
                left = mid + 1;
            } else if (get(matrix, mid) > target) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    int get(int[][] mat, int index) {
        int n = mat[0].length;
        int r = index / n, c = index % n;
        return mat[r][c];
    }
}
