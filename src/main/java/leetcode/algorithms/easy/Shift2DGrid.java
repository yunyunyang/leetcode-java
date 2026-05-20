package leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

// 1260. Shift 2D Grid
public class Shift2DGrid {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int mn = m * n;
        k = k % mn;
        reverse(grid, mn - k, mn - 1);
        reverse(grid, 0, mn - k - 1);
        reverse(grid, 0, mn - 1);

        List<List<Integer>> res = new ArrayList<>();
        for (int[] row : grid) {
            List<Integer> rowList = new ArrayList<>();
            for (int num : row) {
                rowList.add(num);
            }
            res.add(rowList);
        }
        return res;
    }

    int get(int[][] grid, int index) {
        int n = grid[0].length;
        int i = index / n;
        int j = index % n;
        return grid[i][j];
    }

    void set(int[][] grid, int index, int val) {
        int n = grid[0].length;
        int i = index / n;
        int j = index % n;
        grid[i][j] = val;
    }

    void reverse(int[][] grid, int i, int j) {
        while (i < j) {
            int temp = get(grid, i);
            set(grid, i, get(grid, j));
            set(grid, j, temp);
            i++;
            j--;
        }
    }
}
