package leetcode.algorithms.medium;

import java.util.Arrays;

// 1760. Minimum Limit of Balls in a Bag
public class MinimumLimitOfBallsInABag {

    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1, right = Arrays.stream(nums).max().getAsInt();
        int output = right;

        while (left <= right) {
            int mid = (left + right) / 2;
            int ops = 0;
            for (int n : nums) {
                ops += (n - 1) / mid;
                if (ops > maxOperations) break;
            }
            if (ops <= maxOperations) {
                output = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return output;
    }
}
