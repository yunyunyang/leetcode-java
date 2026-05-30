package leetcode.algorithms.medium;

import leetcode.algorithms.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// 652. Find Duplicate Subtrees
public class FindDuplicateSubtrees {

    Map<String, Integer> memo = new HashMap<>();
    List<TreeNode> res = new LinkedList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        traverse(root);
        return res;
    }

    String traverse(TreeNode node) {
        if (node == null) {
            return "#";
        }

        String left = traverse(node.left);
        String right = traverse(node.right);

        String subTree = left + "," + right + "," + node.val;
        int count = memo.getOrDefault(subTree, 0);
        if (count == 1) {
            res.add(node);
        }
        memo.put(subTree, count + 1);
        return subTree;
    }
}
