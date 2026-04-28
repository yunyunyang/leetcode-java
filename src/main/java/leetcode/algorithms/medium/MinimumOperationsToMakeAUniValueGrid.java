package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 2033. Minimum Operations to Make a Uni-Value Grid
public class MinimumOperationsToMakeAUniValueGrid {

    public int minOperations(int[][] grid, int x) {
        List<Integer> list = new ArrayList<>();
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                list.add(grid[r][c]);
            }
        }

        Collections.sort(list);
        int mid = list.get(list.size() / 2);

        int ops = 0;
        for (int num : list) {
            if (num % x != mid % x) {
                return -1;
            }
            ops += Math.abs(mid - num) / x;
        }
        return ops;
    }
}
