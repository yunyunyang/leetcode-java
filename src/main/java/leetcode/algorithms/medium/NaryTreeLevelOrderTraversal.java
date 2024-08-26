package leetcode.algorithms.medium;

import leetcode.algorithms.Node;

import java.util.*;

// 429. N-ary Tree Level Order Traversal
public class NaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> output = new ArrayList<>();
        if (root == null) {
            return output;
        }
        Queue<Node> q =  new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                level.add(node.val);

                if (node.children != null) {
                    q.addAll(node.children);
                }
            }
            output.add(level);
        }
        return output;
    }
}
