package leetcode.algorithms.easy;

import java.util.HashSet;
import java.util.Set;

// 2923. Find Champion I
public class FindChampionI {

    public int findChampion(int[][] grid) {
        int champion = -1;
        Set<Integer> teams = new HashSet<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !teams.contains(i)) {
                    champion = i;
                    teams.add(j);
                }
            }
        }
        return champion;
    }
}
