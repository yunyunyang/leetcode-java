package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

// 692. Top K Frequent Words
public class TopKFrequentWords {

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>
                ((entry1, entry2) -> {
                    if (entry1.getValue().equals(entry2.getValue())) {
                        return entry2.getKey().compareTo(entry1.getKey());
                    }
                    return entry1.getValue().compareTo(entry2.getValue());
                });

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k)
                pq.poll();
        }

        LinkedList<String> res = new LinkedList<>();
        while (!pq.isEmpty()) {
            res.addFirst(pq.poll().getKey());
        }
        return res;
    }
}
