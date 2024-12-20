package leetcode.algorithms.medium;

import leetcode.algorithms.TreeNode;

// 2415. Reverse Odd Levels of Binary Tree
public class ReverseOddLevelsOfBinaryTree {

    public TreeNode reverseOddLevels(TreeNode root) {
        dfs(root.left, root.right, 1);
        return root;
    }

    private void dfs(TreeNode left, TreeNode right, int level) {
        if (left == null || right == null) {
            return;
        }

        if (level % 2 == 1) {
            int tmp = left.val;
            left.val = right.val;
            right.val = tmp;
        }
        dfs(left.left, right.right, level + 1);
        dfs(left.right, right.left, level + 1);
    }
}
