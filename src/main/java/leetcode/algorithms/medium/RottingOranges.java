package leetcode.algorithms.medium;

import java.util.ArrayDeque;
import java.util.Queue;

// 994. Rotting Oranges
public class RottingOranges {

    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new ArrayDeque<>();
        int time = 0;
        int fresh = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    fresh ++;
                }
                if (grid[r][c] == 2) {
                    queue.offer(new int[]{r, c});
                }
            }
        }
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while (fresh > 0 && !queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];
                for (int[] dir : directions) {
                    int row = r + dir[0];
                    int col = c + dir[1];
                    if ((row >= 0 && row < grid.length) &&
                            (col >= 0 && col < grid[0].length) &&
                            (grid[row][col] == 1)) {
                        fresh --;
                        grid[row][col] = 2;
                        queue.offer(new int[] {row, col});
                    }
                }
            }
            time ++;
        }
        return fresh == 0 ? time : -1;
    }
}
