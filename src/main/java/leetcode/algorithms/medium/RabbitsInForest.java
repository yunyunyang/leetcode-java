package leetcode.algorithms.medium;

import java.util.HashMap;
import java.util.Map;

// 781. Rabbits in Forest
public class RabbitsInForest {

    public int numRabbits(int[] answers) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int ans : answers) {
            count.put(ans, count.getOrDefault(ans, 0) + 1);
        }

        System.out.println(count);

        int result = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            result += Math.ceil((double)entry.getValue() / (entry.getKey() + 1)) * (entry.getKey() + 1);
        }
        return result;
    }
}
