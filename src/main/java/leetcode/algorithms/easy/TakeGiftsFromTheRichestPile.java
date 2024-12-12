package leetcode.algorithms.easy;

import java.util.Collections;
import java.util.PriorityQueue;

// 2558. Take Gifts From the Richest Pile
public class TakeGiftsFromTheRichestPile {

    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int n : gifts) {
            heap.add(n);
        }

        for (int i = 0; i < k; i++) {
            int maxPile = heap.poll();
            heap.add((int) Math.sqrt(maxPile));
        }

        long sum = 0;
        for (int val : heap) {
            sum += val;
        }
        return sum;
    }
}
