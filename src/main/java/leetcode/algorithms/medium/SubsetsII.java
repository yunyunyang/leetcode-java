package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        createSubset(nums, 0, result, subset);
        return result;
    }
    public void createSubset(int[] nums, int i, List<List<Integer>> result, List<Integer> subset) {
        if (i == nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        createSubset(nums, i + 1, result, subset);
        subset.remove(subset.size() - 1);

        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
            i ++;
        }
        createSubset(nums, i + 1, result, subset);
    }
}
