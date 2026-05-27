package leetcode.algorithms.medium;

import java.util.HashMap;
import java.util.Map;

// 3121. Count the Number of Special Characters II
public class CountTheNumberOfSpecialCharactersII {

    public int numberOfSpecialChars(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c >= 'a' && c <= 'z') {
                map.put(c, i);
            } else {
                if (!map.containsKey(c)) {
                    map.put(c, i);
                }
            }
        }

        int res = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            char upper = (char) (c - 'a' + 'A');
            if (map.containsKey(c) && map.containsKey(upper) && map.get(c) < map.get(upper)) {
                res++;
            }
        }
        return res;
    }
}
