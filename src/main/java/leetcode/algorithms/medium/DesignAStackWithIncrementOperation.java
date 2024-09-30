package leetcode.algorithms.medium;

// 1381. Design a Stack With Increment Operation
public class DesignAStackWithIncrementOperation {

    int[] stack;
    int top = -1;

    public DesignAStackWithIncrementOperation(int maxSize) {
        this.stack = new int[maxSize];
    }

    public void push(int x) {
        if (top < stack.length - 1) {
            top ++;
            this.stack[top] = x;
        }
    }

    public int pop() {
        if (top >= 0) {
            return this.stack[top--];
        } else {
            return -1;
        }
    }

    public void increment(int k, int val) {
        if (k >= this.stack.length) {
            k = this.stack.length;
        }
        for (int i = 0; i < k; i++) {
            stack[i] += val;
        }
    }
}
