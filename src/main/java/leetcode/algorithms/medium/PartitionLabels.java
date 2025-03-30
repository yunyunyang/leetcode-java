package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 763. Partition Labels
public class PartitionLabels {

    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count.put(ch, i);
        }

        List<Integer> res = new ArrayList<>();
        int size = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            size++;
            end = Math.max(end, count.get(s.charAt(i)));

            if (i == end) {
                res.add(size);
                size = 0;
            }
        }
        return res;
    }
}
