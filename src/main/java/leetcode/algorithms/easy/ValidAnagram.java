package leetcode.algorithms.easy;

import java.util.HashMap;

// 242. Valid Anagram
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> counter = new HashMap<>();
        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) - 1);
        }
        for (int v : counter.values()) {
            if (v != 0) {
                return false;
            }
        }
        return true;
    }
}
