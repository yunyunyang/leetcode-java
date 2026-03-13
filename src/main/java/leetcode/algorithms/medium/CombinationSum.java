package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 39. Combination Sum
public class CombinationSum {

    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> track = new LinkedList<>();
    int trackSum = 0;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates, target, 0);
        return res;
    }

    void backtrack(int[] nums, int target, int start) {
        if (trackSum == target) {
            res.add(new LinkedList<>(track));
            return;
        }

        if (trackSum > target)
            return;

        for (int i = start; i < nums.length; i++) {
            track.add(nums[i]);
            trackSum += nums[i];

            backtrack(nums, target, i);

            track.removeLast();
            trackSum -= nums[i];
        }
    }
}
