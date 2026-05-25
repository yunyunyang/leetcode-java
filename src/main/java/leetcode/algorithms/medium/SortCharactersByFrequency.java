package leetcode.algorithms.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// 451. Sort Characters By Frequency
public class SortCharactersByFrequency {

    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>
                ((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            pq.offer(entry);
        }

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            String part = String.valueOf(entry.getKey()).repeat(entry.getValue());
            sb.append(part);
        }
        return sb.toString();
    }
}
