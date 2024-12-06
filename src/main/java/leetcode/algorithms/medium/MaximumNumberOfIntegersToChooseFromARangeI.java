package leetcode.algorithms.medium;

import java.util.HashSet;
import java.util.Set;

// 2554. Maximum Number of Integers to Choose From a Range I
public class MaximumNumberOfIntegersToChooseFromARangeI {

    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set = new HashSet<>();
        for (int i : banned) {
            set.add(i);
        }

        int curSum = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                curSum += i;
                count++;
            }
            if (curSum == maxSum) {
                return count;
            }
            if (curSum > maxSum) {
                return (count == 0) ? 0 : count - 1;
            }
        }
        return count;
    }
}
