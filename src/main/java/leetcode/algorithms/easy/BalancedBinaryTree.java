package leetcode.algorithms.easy;

import leetcode.algorithms.TreeNode;

import java.util.ArrayList;

// 110. Balanced Binary Tree
public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) { return true; }
        if (dfs(root) == -1) { return false; }
        return true;
    }

    private int dfs(TreeNode node) {
        if (node == null) { return 0; }
        int left = dfs(node.left);
        int right = dfs(node.right);

        if (left == -1 || right == -1) { return -1; }
        if (Math.abs(left - right) > 1) { return -1; }
        return 1 + Math.max(left, right);
    }
}
