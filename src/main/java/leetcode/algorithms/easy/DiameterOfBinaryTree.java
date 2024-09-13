package leetcode.algorithms.easy;

import leetcode.algorithms.TreeNode;

// 543. Diameter of Binary Tree
public class DiameterOfBinaryTree {

    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return diameter;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = dfs(node.left);
        int right = dfs(node.right);
        diameter = Math.max(diameter, left + right);
        return 1 + Math.max(left, right);
    }
}
