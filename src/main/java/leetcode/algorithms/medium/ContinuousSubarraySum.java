package leetcode.algorithms.medium;

import java.util.HashMap;
import java.util.Map;

// 523. Continuous Subarray Sum
public class ContinuousSubarraySum {

    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] preSum = new int[n + 1];
        preSum[0] = 0;
        for (int i = 0; i < n; i++) {
            preSum[i + 1] = preSum[i] + nums[i];
        }

        Map<Integer, Integer> valToIdx = new HashMap<>();
        for (int i = 0; i < preSum.length; i++) {
            int val = preSum[i] % k;
            if (!valToIdx.containsKey(val)) {
                valToIdx.put(val, i);
            }
        }

        for (int i = 1; i < preSum.length; i++) {
            int val = preSum[i] % k;
            if (valToIdx.containsKey(val)) {
                if (i - valToIdx.get(val) >= 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
