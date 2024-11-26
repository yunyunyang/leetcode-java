package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;

// 2924. Find Champion II
public class FindChampionII {

    public int findChampion(int n, int[][] edges) {
        int[] incoming = new int[n];
        for (int[] edge : edges) {
            incoming[edge[1]] += 1;
        }

        List<Integer> champions = new ArrayList<>();
        for (int i = 0; i < incoming.length; i++) {
            if (incoming[i] == 0) {
                champions.add(i);
            }
        }

        if (champions.size() == 1) {
            return champions.get(0);
        } else {
            return -1;
        }
    }
}
