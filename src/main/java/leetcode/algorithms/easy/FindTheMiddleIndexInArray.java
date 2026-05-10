package leetcode.algorithms.easy;

// 1991. Find the Middle Index in Array
public class FindTheMiddleIndexInArray {

    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int[] preSum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }

        for (int i = 1; i <= n; i++) {
            int leftSum = preSum[i - 1] - preSum[0];
            int rightSum = preSum[n] - preSum[i];
            if (leftSum == rightSum)
                return i - 1;
        }
        return -1;
    }
}
