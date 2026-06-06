package leetcode.algorithms.easy;

// 2574. Left and Right Sum Differences
public class LeftAndRightSumDifferences {

    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        for (int i = 1; i < leftSum.length; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }

        int[] rightSum = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }

        int[] res = new int[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return res;
    }
}
