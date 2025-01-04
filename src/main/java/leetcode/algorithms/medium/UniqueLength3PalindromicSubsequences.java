package leetcode.algorithms.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 1930. Unique Length-3 Palindromic Subsequences
public class UniqueLength3PalindromicSubsequences {

    public int countPalindromicSubsequence(String s) {
        Map<Character, Integer> right = new HashMap<>();
        for (char c : s.toCharArray()) {
            right.put(c, right.getOrDefault(c, 0) + 1);
        }

        Set<Character> left = new HashSet<>();
        Set<String> count = new HashSet<>();
        for (char c : s.toCharArray()) {
            right.put(c, right.get(c) - 1);
            for (char seen : left) {
                if (right.get(seen) > 0) {
                    count.add(c + "," + seen);
                }
            }
            left.add(c);
        }
        return count.size();
    }
}
