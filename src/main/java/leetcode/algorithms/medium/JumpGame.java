package leetcode.algorithms.medium;

// 55. Jump Game
public class JumpGame {

    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            // current position + maximum jpm >= goal
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }
        return goal == 0;
    }
}
