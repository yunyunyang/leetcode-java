package leetcode.algorithms.medium;

import java.util.HashMap;
import java.util.Map;

// 3223. Minimum Length of String After Operations
public class MinimumLengthOfStringAfterOperations {

    public int minimumLength(String s) {
        Map<Character, Integer> freqs = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqs.put(c, freqs.getOrDefault(c, 0) + 1);
        }
        int deletion = 0;
        for (int freq : freqs.values()) {
            if (freq % 2 == 1) {
                deletion += freq - 1;
            } else {
                deletion += freq - 2;
            }
        }
        return s.length() - deletion;
    }
}
