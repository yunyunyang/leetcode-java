package leetcode.algorithms.easy;

import java.util.HashMap;

// 1. Two Sum
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] output = new int[2];
        int curr;
        for (int i = 0; i < nums.length; i++) {
            curr = target - nums[i];
            if (map.containsKey(curr)) {
                output[0] = map.get(curr);
                output[1] = i;
            }
            map.put(nums[i], i);
        }
        return output;
    }
}
