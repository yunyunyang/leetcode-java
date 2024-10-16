package leetcode.algorithms.medium;

import java.util.HashSet;
import java.util.Set;

// 3. Longest Substring Without Repeating Characters
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int left = 0;
        Set<Character> seen = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            while (seen.contains(c)) {
                seen.remove(s.charAt(left));
                left ++;
            }
            seen.add(c);
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
    }
}
