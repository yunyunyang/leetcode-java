package leetcode.algorithms.easy;

import java.util.HashSet;
import java.util.Set;

// 1684. Count the Number of Consistent Strings
public class CountTheNumberOfConsistentStrings {

    public static int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }

        int output = 0;
        for (String word : words) {
            int flag = 1;
            for (char c : word.toCharArray()) {
                if (!set.contains(c)) {
                    flag = 0;
                    break;
                }
            }
            output += flag;
        }
        return output;
    }
}
