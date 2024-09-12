package leetcode.algorithms.easy;

import leetcode.algorithms.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

// 637. Average of Levels in Binary Tree
public class AverageOfLevelsInBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> average = new ArrayList<>();
        Deque<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while (!q.isEmpty()) {
            double val = 0;
            int num = 0;
            int size = q.size();
            for (int i = 0; i < size; i ++) {
                TreeNode node = q.pollFirst();
                num += 1;
                val += node.val;
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            average.add(val / num);
        }
        return average;
    }
}
