package leetcode.algorithms.easy;

// 3105. Longest Strictly Increasing or Strictly Decreasing Subarray
public class LongestStrictlyIncreasingOrStrictlyDecreasingSubarray {

    public int longestMonotonicSubarray(int[] nums) {
        int incLength = 1, decLength = 1;
        int maxLength = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                incLength += 1;
                decLength = 1;
            } else if (nums[i] < nums[i - 1]) {
                decLength += 1;
                incLength = 1;
            } else {
                incLength = 1;
                decLength = 1;
            }
            maxLength = Math.max(maxLength, Math.max(incLength, decLength));
        }
        return maxLength;
    }
}
