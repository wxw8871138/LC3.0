package Jianzhi2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class JZ32LC102 {
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            Queue<TreeNode> queue = new ArrayDeque<>();
            if (root != null) {
                queue.add(root);
            }
            while (!queue.isEmpty()) {
                List<Integer> level = new ArrayList<>();
                int levelSize = queue.size();
                for (int i = 0; i < levelSize; i++) {
                    TreeNode node = queue.poll();
                    level.add(node.val);
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
                res.add(level);
            }
            return res;
        }
    }
}
