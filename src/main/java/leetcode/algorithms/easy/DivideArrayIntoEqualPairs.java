package leetcode.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

// 2206. Divide Array Into Equal Pairs
public class DivideArrayIntoEqualPairs {

    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
