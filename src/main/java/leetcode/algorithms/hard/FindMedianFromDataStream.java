package leetcode.algorithms.hard;

import java.util.PriorityQueue;
import java.util.Queue;

// 295. Find Median from Data Stream
public class FindMedianFromDataStream {

    private Queue<Integer> small;
    private Queue<Integer> large;

    public FindMedianFromDataStream() {
        small = new PriorityQueue<>((a, b) -> b - a);
        large = new PriorityQueue<>((a, b) -> a - b);
    }

    public void addNum(int num) {
        small.offer(num);
        if (small.size() - large.size() > 1 || !large.isEmpty() && small.peek() > large.peek()) {
            large.offer(small.poll());
        }
        if (large.size() - small.size() > 1) {
            small.offer(large.poll());
        }
    }

    public double findMedian() {
        if (small.size() > large.size()) {
            return (double) small.peek();
        } else if (large.size() > small.size()) {
            return (double) large.peek();
        } else {
            return (double) (small.peek() + large.peek()) / 2;
        }
    }
}
