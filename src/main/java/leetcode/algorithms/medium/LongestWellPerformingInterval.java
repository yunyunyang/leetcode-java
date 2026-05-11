package leetcode.algorithms.medium;

import java.util.HashMap;
import java.util.Map;

// 1124. Longest Well-Performing Interval
public class LongestWellPerformingInterval {

    public int longestWPI(int[] hours) {
        int n = hours.length;
        int[] preSum = new int[n + 1];

        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            preSum[i] = preSum[i - 1] + (hours[i - 1] > 8 ? 1 : -1);
            if (!map.containsKey(preSum[i])) {
                map.put(preSum[i], i);
            }

            if (preSum[i] > 0 ) {
                res = Math.max(res, i);
            } else {
                if (map.containsKey(preSum[i] - 1)) {
                    int j = map.get(preSum[i] - 1);
                    res = Math.max(res, i - j);
                }
            }
        }
        return res;
    }
}
