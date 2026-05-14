package leetcode.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

// 2784. Check if Array is Good
public class CheckIfArrayIsGood {

    public boolean isGood(int[] nums) {
        int n = nums.length;
        if (n <= 1) return false;

        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (int i = 1; i < n; i++) {
            int expected = (i == n - 1) ? 2 : 1;
            if (count.getOrDefault(i, 0) != expected)
                return false;
        }
        return true;
    }
}
