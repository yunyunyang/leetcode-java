package leetcode.algorithms.medium;

// 209. Minimum Size Subarray Sum
public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0;
        int windowSum = 0;

        int minLen = Integer.MAX_VALUE;
        while (right < nums.length) {
            windowSum += nums[right];
            right++;

            while (windowSum >= target && left < right) {
                minLen = Math.min(minLen, right - left);
                windowSum -= nums[left];
                left++;
            }
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}
