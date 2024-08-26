package leetcode.algorithms.medium;

import java.util.HashSet;
import java.util.Set;

// 200. Number of Islands
public class NumberOfIslands {

    public static int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Set<String> visited = new HashSet<>();
        int islands = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1' && !visited.contains(r + "," + c)) {
                    islands ++;
                    dfs(grid, r, c, visited);
                }
            }
        }
        return islands;
    }

    private static void dfs(char[][] grid, int row, int col, Set<String> visited) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (row < 0 || row >= rows ||
                col < 0 || col >= cols ||
                grid[row][col] == '0' ||
                visited.contains(row + "," + col)) {
            return;
        }
        visited.add(row + "," + col);
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int[] direction : directions) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];
            dfs(grid, newRow, newCol, visited);
        }
    }
}
