package leetcode.algorithms.medium;

import java.util.*;

// 49. Group Anagrams
public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String word = new String(chars);
            map.computeIfAbsent(word, key -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}