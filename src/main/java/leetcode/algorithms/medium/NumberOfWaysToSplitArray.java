package leetcode.algorithms.medium;

// 2270. Number of Ways to Split Array
public class NumberOfWaysToSplitArray {

    public int waysToSplitArray(int[] nums) {
        long totalSum = 0;
        for (int n : nums) {
            totalSum += n;
        }
        long curSum = 0;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            curSum += nums[i];
            totalSum -= nums[i];
            if (curSum >= totalSum) {
                count ++;
            }
        }
        return count;
    }
}
