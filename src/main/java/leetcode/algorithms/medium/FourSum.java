package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 18. 4Sum
public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<List<Integer>> tuples = threeSum(nums, target - nums[i], i + 1);
            for (List<Integer> tuple : tuples) {
                tuple.add(nums[i]);
                res.add(tuple);
            }
            while (i < n - 1 && nums[i] == nums[i + 1]) i++;
        }
        return res;
    }

    List<List<Integer>> threeSum(int[] nums, long target, int start) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = start; i < n; i++) {
            List<List<Integer>> pairs = twoSum(nums, target - nums[i], i + 1);
            for (List<Integer> pair : pairs) {
                pair.add(nums[i]);
                res.add(pair);
            }
            while (i < n - 1 && nums[i] == nums[i + 1]) i++;
        }
        return res;
    }

    List<List<Integer>> twoSum(int[] nums, long target, int start) {
        int lo = start, hi = nums.length - 1;

        List<List<Integer>> res = new ArrayList<>();
        while (lo < hi) {
            int sum = nums[lo] + nums[hi];
            int left = nums[lo], right = nums[hi];
            if (sum < target) {
                while (lo < hi && nums[lo] == left) lo++;
            } else if (sum > target) {
                while (lo < hi && nums[hi] == right) hi--;
            } else {
                res.add(new ArrayList<>(Arrays.asList(nums[lo], nums[hi])));
                while (lo < hi && nums[lo] == left) lo++;
                while (lo < hi && nums[hi] == right) hi--;
            }
        }
        return res;
    }
}
