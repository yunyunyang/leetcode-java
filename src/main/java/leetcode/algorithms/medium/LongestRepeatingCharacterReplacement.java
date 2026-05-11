package leetcode.algorithms.medium;

// 424. Longest Repeating Character Replacement
public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {
        int left = 0, right = 0;
        int[] windowCharCount = new int[26];
        int windowMaxCount = 0;

        int res = 0;
        while (right < s.length()) {
            int c = s.charAt(right) - 'A';
            windowCharCount[c]++;
            windowMaxCount = Math.max(windowMaxCount, windowCharCount[c]);
            right++;

            while (right - left - windowMaxCount > k) {
                windowCharCount[s.charAt(left) - 'A']--;
                left++;
            }
            res = Math.max(res, right - left);
        }
        return res;
    }
}
