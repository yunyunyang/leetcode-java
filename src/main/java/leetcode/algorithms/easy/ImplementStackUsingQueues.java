package leetcode.algorithms.easy;

import java.util.LinkedList;
import java.util.Queue;

// 225. Implement Stack using Queues
public class ImplementStackUsingQueues {

    private Queue<Integer> q = new LinkedList<>();;
    private int top = 0;

    public ImplementStackUsingQueues() {

    }

    public void push(int x) {
        q.offer(x);
        top = x;
    }

    public int pop() {
        int size = q.size();
        while (size > 2) {
            q.offer(q.poll());
            size--;
        }
        top = q.peek();
        q.offer(q.poll());
        return q.poll();
    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
