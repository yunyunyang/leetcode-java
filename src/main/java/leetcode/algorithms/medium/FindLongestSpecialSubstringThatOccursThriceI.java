package leetcode.algorithms.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 2981. Find Longest Special Substring That Occurs Thrice I
public class FindLongestSpecialSubstringThatOccursThriceI {

    public int maximumLength(String s) {
        Map<String, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                String str = s.substring(i, j);
                count.put(str, count.getOrDefault(str, 0) + 1);
            }
        }

        int output = -1;
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            String key = entry.getKey();
            Integer val = entry.getValue();
            if (val >= 3) {
                Set<Character> charSet = new HashSet<>();
                for (char c : key.toCharArray()) {
                    charSet.add(c);
                }
                if (charSet.size() == 1) {
                    output = Math.max(output, key.length());
                }
            }
        }
        return output;
    }
}
