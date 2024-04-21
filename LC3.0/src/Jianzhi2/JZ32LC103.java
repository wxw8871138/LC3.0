package Jianzhi2;

import java.util.*;

public class JZ32LC103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        boolean leftToRight = true;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            Deque<Integer> level = new LinkedList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode treeNode = queue.poll();
                if (leftToRight) {
                    level.offerLast(treeNode.val);
                } else {
                    level.offerFirst(treeNode.val);
                }
                if (treeNode.left != null) {
                    queue.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.add(treeNode.right);
                }
            }
            leftToRight = !leftToRight;
            res.add(new ArrayList<>(level));
        }
        return res;
    }
}
