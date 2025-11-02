package leetcode.algorithms.easy;

// 303. Range Sum Query - Immutable
public class RangeSumQueryImmutable {

    int[] prefixSum;

    public void NumArray(int[] nums) {
        prefixSum = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
    }
}
