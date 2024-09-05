package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;

// 78. Subsets
public class Subsets {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        createSubset(nums, 0, result, subset);
        return result;
    }

    private static void createSubset(int[] nums, int i, List<List<Integer>> result, List<Integer> subset) {
        if (i >= nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        createSubset(nums, i + 1, result, subset);
        subset.remove(subset.size() - 1);
        createSubset(nums, i + 1, result, subset);
    }
}
