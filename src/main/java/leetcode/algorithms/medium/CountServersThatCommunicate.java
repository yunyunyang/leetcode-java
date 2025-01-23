package leetcode.algorithms.medium;

// 1267. Count Servers that Communicate
public class CountServersThatCommunicate {

    public int countServers(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[] rowsCount = new int[rows];
        int[] colsCount = new int[cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                rowsCount[r] += grid[r][c];
                colsCount[c] += grid[r][c];
            }
        }

        int res = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1 && (rowsCount[r] > 1 || colsCount[c] > 1)) {
                    res ++;
                }
            }
        }
        return res;
    }
}
