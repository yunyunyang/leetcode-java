package leetcode.algorithms.easy;

import leetcode.algorithms.TreeNode;

// 112. Path Sum
public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, 0, targetSum);
    }

    private boolean dfs(TreeNode node, int curSum, int targetSum) {
        if (node == null) {
            return false;
        }

        curSum += node.val;
        if (node.left == null && node.right == null) {
            return curSum == targetSum;
        }
        return (dfs(node.left, curSum, targetSum) || dfs(node.right, curSum, targetSum));
    }
}
