package leetcode.algorithms.medium;

import leetcode.algorithms.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

// 199. Binary Tree Right Side View
public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        Deque<TreeNode> q = new ArrayDeque<>();
        if (root != null) { q.add(root); }

        while (!q.isEmpty()) {
            TreeNode rightNode = null;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.pollFirst();
                if (node != null) {
                    rightNode = node;
                    if (node.left != null) { q.add(node.left); }
                    if (node.right != null) { q.add(node.right); }
                }
            }
            if (rightNode != null) {
                output.add(rightNode.val);
            }
        }
        return output;
    }
}
