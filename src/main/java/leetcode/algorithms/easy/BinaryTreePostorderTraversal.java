package leetcode.algorithms.easy;

import leetcode.algorithms.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        dfs(root, output);
        return output;
    }

    private void dfs(TreeNode node, List<Integer> output) {
        if (node != null) {
            dfs(node.left, output);
            dfs(node.right, output);
            output.add(node.val);
        }
    }
}
