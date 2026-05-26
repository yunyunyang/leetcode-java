package leetcode.algorithms.easy;

import java.util.HashSet;
import java.util.Set;

// 3120. Count the Number of Special Characters I
public class CountTheNumberOfSpecialCharactersI {

    public int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<>();
        for (char c : word.toCharArray()) {
            set.add(c);
        }

        int res = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            if (set.contains(c) && set.contains((char) (c - 'a' + 'A')))
                res++;
        }
        return res;
    }
}
