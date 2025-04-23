package leetcode.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

// 1399. Count Largest Group
public class CountLargestGroup {

    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxValue = 0;
        for (int i = 1; i <= n; i++) {
            int key = 0, tmp = i;
            while (tmp != 0) {
                key += tmp % 10;
                tmp /= 10;
            }
            map.put(key, map.getOrDefault(key, 0) + 1);
            maxValue = Math.max(maxValue, map.get(key));
        }

        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValue) {
                result++;
            }
        }
        return result;
    }
}
