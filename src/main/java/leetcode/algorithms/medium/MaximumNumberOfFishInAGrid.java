package leetcode.algorithms.medium;

import java.util.HashSet;
import java.util.Set;

// 2658. Maximum Number of Fish in a Grid
public class MaximumNumberOfFishInAGrid {

    int maxFish = 0;
    int rows;
    int cols;

    public int findMaxFish(int[][] grid) {
        Set<String> visit = new HashSet<>();
        rows = grid.length;
        cols = grid[0].length;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                maxFish = Math.max(maxFish, dfs(r, c, grid, visit));
            }
        }
        return maxFish;
    }
    private int dfs(int r, int c, int[][] grid, Set<String> visit) {
        if (r < 0 || c < 0 || r >= rows || c >= cols ||
                grid[r][c] == 0 || visit.contains(r + "," + c )) {
            return 0;
        }

        visit.add(r + "," + c);
        return grid[r][c] +
                dfs(r + 1, c, grid, visit) +
                dfs(r - 1, c, grid, visit) +
                dfs(r, c + 1, grid, visit) +
                dfs(r, c - 1, grid, visit);
    }
}
