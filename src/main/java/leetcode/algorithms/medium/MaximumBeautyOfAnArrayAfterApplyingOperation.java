package leetcode.algorithms.medium;

import java.util.Arrays;

// 2779. Maximum Beauty of an Array After Applying Operation
public class MaximumBeautyOfAnArrayAfterApplyingOperation {

    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int longest = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            while (nums[right] - nums[left] > 2 * k) {
                left ++;
            }
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
    }
}
