package leetcode.algorithms.medium;

// 45. Jump Game II
public class JumpGameII {

    public static int jump(int[] nums) {
        int steps = 0;
        int left = 0;
        int right = 0;

        while (right < nums.length - 1) {
            int farthest = 0;
            for (int i = left; i <= right; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }
            left = right + 1;
            right = farthest;
            steps += 1;
        }
        return steps;
    }
}
