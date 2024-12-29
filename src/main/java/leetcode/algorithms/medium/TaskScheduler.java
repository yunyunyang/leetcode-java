package leetcode.algorithms.medium;

import java.util.*;

// 621. Task Scheduler
public class TaskScheduler {

    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> count = new HashMap<>();
        for (char t : tasks) {
            count.put(t, count.getOrDefault(t, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int v : count.values()) {
            heap.add(v);
        }

        int timer = 0;
        Queue<int[]> q = new LinkedList<>();
        while (!heap.isEmpty() || !q.isEmpty()) {
            timer ++;
            if (!heap.isEmpty()) {
                int t = heap.poll();
                if (t - 1 != 0) {
                    q.add(new int[] {t - 1, timer + n});
                }
            }
            if (!q.isEmpty()) {
                if (q.peek()[1] == timer) {
                    int[] ary = q.poll();
                    heap.add(ary[0]);
                }
            }
        }
        return timer;
    }
}
