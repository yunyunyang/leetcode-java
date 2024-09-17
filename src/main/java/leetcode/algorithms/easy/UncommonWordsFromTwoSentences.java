package leetcode.algorithms.easy;

import java.util.*;

// 884. Uncommon Words from Two Sentences
public class UncommonWordsFromTwoSentences {

    public String[] uncommonFromSentences(String s1, String s2) {
        String[] a1 = s1.split(" ");
        String[] a2 = s1.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String word : a1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word : a2) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<String> output = new ArrayList<>();
        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                output.add(word);
            }
        }
        return output.toArray(new String[0]);
    }
}
