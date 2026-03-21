package leetcode.algorithms.easy;

// 3643. Flip Square Submatrix Vertically
public class FlipSquareSubmatrixVertically {

    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int bot = x + k - 1;
        for (int r = x; r < x + k / 2; r++) {
            for (int c = y; c < y + k; c++) {
                int tmp = grid[r][c];
                grid[r][c] = grid[bot][c];
                grid[bot][c] = tmp;
            }
            bot--;
        }
        return grid;
    }
}
