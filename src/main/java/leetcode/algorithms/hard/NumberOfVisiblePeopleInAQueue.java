package leetcode.algorithms.hard;

import java.util.Stack;

// 1944. Number of Visible People in a Queue
public class NumberOfVisiblePeopleInAQueue {

    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            int count = 0;  // 記錄右側比自己矮的人
            while (!stack.isEmpty() && heights[i] > stack.peek()) {
                stack.pop();
                count++;
            }
            // 如果右邊沒比自己高的人只能看到矮的人；如果右邊有人比自己高，除了矮的人還能看到這個高的人
            res[i] = stack.isEmpty() ? count : count + 1;
            stack.push(heights[i]);
        }
        return res;
    }
}
