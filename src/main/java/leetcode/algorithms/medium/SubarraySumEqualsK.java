package leetcode.algorithms.medium;

import java.util.HashMap;
import java.util.Map;

// 560. Subarray Sum Equals K
public class SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] preSum = new int[n + 1];

        Map<Integer, Integer> count = new HashMap<>();
        count.put(0, 1);

        int res = 0;
        for (int i = 1; i <= n; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];

            int need = preSum[i] - k;
            if (count.containsKey(need)) {
                res += count.get(need);
            }

            if (!count.containsKey(preSum[i])) {
                count.put(preSum[i], 1);
            } else {
                count.put(preSum[i], count.get(preSum[i]) + 1);
            }
        }
        return res;
    }
}
