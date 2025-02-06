package leetcode.algorithms.medium;

import java.util.HashMap;
import java.util.Map;

public class TupleWithSameProduct {

    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int prod = nums[i] * nums[j];
                map.put(prod, map.getOrDefault(prod, 0) + 1);
            }
        }

        int res = 0;
        for (int val : map.values()) {
            if (val >= 2) {
                res += (((val - 1) * val) / 2) * 8;
            }
        }
        return res;
    }
}
