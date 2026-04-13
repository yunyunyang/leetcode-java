package leetcode.algorithms.easy;

// 1848. Minimum Distance to the Target Element
public class MinimumDistanceToTheTargetElement {

    public int getMinDistance(int[] nums, int target, int start) {
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                res = Math.min(res, Math.abs(i - start));
            }
        }
        return res;
    }
}
