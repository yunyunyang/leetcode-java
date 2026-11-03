package leetcode.algorithms.easy;

import java.util.Arrays;

// 3736. Minimum Moves to Equal Array Elements III
public class MinimumMovesToEqualArrayElementsIII {

    public int minMoves(int[] nums) {
        int res = 0;
        int max = Arrays.stream(nums).max().getAsInt();
        for (int i = 0; i < nums.length; i++) {
            res += max - nums[i];
        }
        return res;
    }
}
