package leetcode.algorithms.medium;

import java.util.HashSet;
import leetcode.algorithms.TreeNode;

// 1261. Find Elements in a Contaminated Binary Tree
public class FindElementsInAContaminatedBinaryTree {
    HashSet<Integer> seen;

    public FindElementsInAContaminatedBinaryTree(TreeNode root) {
        seen = new HashSet<>();
        bfs(root, 0);
    }

    public boolean find(int target) {
        return seen.contains(target);
    }

    private void bfs(TreeNode node, int count) {
        if (node == null) return;
        seen.add(count);
        bfs(node.left, count * 2 + 1);
        bfs(node.right, count * 2 + 2);
    }
}
