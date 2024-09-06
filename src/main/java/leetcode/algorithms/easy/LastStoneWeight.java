package leetcode.algorithms.easy;

import java.util.Collections;
import java.util.PriorityQueue;

// 1046. Last Stone Weight
public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            pq.offer(stone);
        }

        while (pq.size() > 1) {
            int x = pq.poll();
            int y = pq.poll();
            int diff = Math.abs(x - y);
            pq.offer(diff);
        }
        return pq.poll();
    }
}
