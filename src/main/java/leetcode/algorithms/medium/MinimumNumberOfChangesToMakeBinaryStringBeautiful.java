package leetcode.algorithms.medium;

// 2914. Minimum Number of Changes to Make Binary String Beautiful
public class MinimumNumberOfChangesToMakeBinaryStringBeautiful {

    public int minChanges(String s) {
        int changes = 0;
        for (int i = 0; i < s.length(); i += 2) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                changes ++;
            }
        }
        return changes;
    }
}
