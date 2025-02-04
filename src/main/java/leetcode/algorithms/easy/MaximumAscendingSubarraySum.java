package leetcode.algorithms.easy;

//1800. Maximum Ascending Subarray Sum
public class MaximumAscendingSubarraySum {

    public int maxAscendingSum(int[] nums) {
        int maxSum = 0;
        int curSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                maxSum = Math.max(maxSum, curSum);
                curSum = 0;
            }
            curSum += nums[i];
        }
        return Math.max(maxSum, curSum);
    }
}
