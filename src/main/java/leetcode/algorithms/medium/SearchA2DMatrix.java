package leetcode.algorithms.medium;

// 74. Search a 2D Matrix
public class SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length * matrix[0].length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int x = (int) Math.floor(mid / matrix[0].length);
            int y = mid % matrix[0].length;
            if (matrix[x][y] == target) {
                return true;
            } else if (matrix[x][y] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
