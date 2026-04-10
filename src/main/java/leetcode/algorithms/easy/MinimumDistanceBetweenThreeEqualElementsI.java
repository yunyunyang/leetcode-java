package leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 3740. Minimum Distance Between Three Equal Elements I
public class MinimumDistanceBetweenThreeEqualElementsI {

    public static int minimumDistance(int[] nums) {
        if (nums.length < 3)
            return -1;

        Map<Integer, List<Integer>> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            count.computeIfAbsent(nums[i], k -> new ArrayList<>());
            count.get(nums[i]).add(i);
        }

        int res = Integer.MAX_VALUE;
        for (Map.Entry<Integer, List<Integer>> entry : count.entrySet()) {
            Integer key = entry.getKey();
            List<Integer> val = entry.getValue();

            if (count.get(key).size() >= 3) {
                for (int idx = 0; idx < val.size(); idx++) {
                    int i = val.get(idx), j = val.get((idx + 1) % val.size()), k = val.get((idx + 2) % val.size());
                    res = Math.min(res, Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i));
                }
            }
        }
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }
}
