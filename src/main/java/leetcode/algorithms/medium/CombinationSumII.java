package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// 40. Combination Sum II
public class CombinationSumII {

    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> track = new LinkedList<>();
    int trackSum = 0;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (target == 0)
            return res;

        Arrays.sort(candidates);
        backtrack(candidates, target, 0);
        return res;
    }

    void backtrack(int[] candidates, int target, int start) {
        if (trackSum == target) {
            res.add(new LinkedList<>(track));
            return;
        }

        if (trackSum > target)
            return;

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1])
                continue;

            track.add(candidates[i]);
            trackSum += candidates[i];

            backtrack(candidates, target, i + 1);

            track.removeLast();
            trackSum -= candidates[i];
        }
    }
}
