package leetcode.algorithms.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 290. Word Pattern
public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length())
            return false;

        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            if (!map.containsKey(c)) {
                if (set.contains(word)) {
                    return false;
                }
                map.put(c, word);
            } else {
                if (!map.get(c).equals(word)) {
                    return false;
                }
            }
            set.add(word);
        }
        return true;
    }
}
