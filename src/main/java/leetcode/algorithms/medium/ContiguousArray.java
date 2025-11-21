package leetcode.algorithms.medium;

import java.util.HashMap;
import java.util.Map;

// 525. Contiguous Array
public class ContiguousArray {

    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int[] preSum = new int[n + 1];
        preSum[0] = 0;
        for (int i = 0; i < n; i++) {
            preSum[i + 1] = preSum[i] + (nums[i] == 0 ? -1 : 1);
        }

        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < preSum.length; i++) {
            if (!map.containsKey(preSum[i])) {
                map.put(preSum[i], i);
            } else {
                res = Math.max(res, i - map.get(preSum[i]));
            }
        }
        return res;
    }
}
