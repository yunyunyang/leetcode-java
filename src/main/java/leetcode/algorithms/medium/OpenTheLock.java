package leetcode.algorithms.medium;

import java.util.*;

// 752. Open the Lock
public class OpenTheLock {

    public int openLock(String[] deadends, String target) {
        Set<String> deads = new HashSet<>();
        Collections.addAll(deads, deadends);
        if (deads.contains("0000")) return -1;

        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.offer("0000");
        visited.add("0000");
        int step = 0;

        while (!q.isEmpty()) {
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                String cur = q.poll();
                if (cur.equals(target))
                    return step;

                for (String neighbor : getNeighbors(cur)) {
                    if (!visited.contains(neighbor) && !deads.contains(neighbor)) {
                        q.offer(neighbor);
                        visited.add(neighbor);
                    }
                }
            }
            step++;
        }
        return -1;
    }

    String plusOne(String s, int i) {
        char[] chars = s.toCharArray();
        if (chars[i] == '9')
            chars[i] = '0';
        else
            chars[i] += 1;
        return new String(chars);
    }

    String minusOne(String s, int i) {
        char[] chars = s.toCharArray();
        if (chars[i] == '0')
            chars[i] = '9';
        else
            chars[i] -= 1;
        return new String(chars);
    }

    List<String> getNeighbors(String s) {
        List<String> neighbors = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            neighbors.add(plusOne(s, i));
            neighbors.add(minusOne(s, i));
        }
        return neighbors;
    }
}
