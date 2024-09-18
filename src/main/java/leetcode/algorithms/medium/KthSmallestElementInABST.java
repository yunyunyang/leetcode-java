package leetcode.algorithms.medium;

import leetcode.algorithms.TreeNode;

import java.util.ArrayList;
import java.util.List;

// 230. Kth Smallest Element in a BST
public class KthSmallestElementInABST {

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        dfs(root, k, list);
        return list.get(k - 1);
    }

    private void dfs(TreeNode node, int k, List<Integer> list) {
        if (node == null) {
            return;
        }
        dfs(node.left, k, list);
        list.add(node.val);
        dfs(node.right, k, list);
    }
}
