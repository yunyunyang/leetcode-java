package leetcode.algorithms.medium;

import java.util.*;

// 2501. Longest Square Streak in an Array
public class LongestSquareStreakInAnArray {

    public int longestSquareStreak(int[] nums) {
        Set<Integer> sortedSet = new TreeSet<>();
        for (int num : nums) {
            sortedSet.add(num);
        }
        Set<Integer> numsSet = new HashSet<>(sortedSet);

        int result = -1;
        for (int num : numsSet) {
            int length = 0;
            long n = num;
            while (n <= Integer.MAX_VALUE && numsSet.contains((int)n)) {
                length ++;
                n = n * n;
            }
            if (length > 1) {
                result = Math.max(result, length);
            }
        }
        return result;
    }
}
