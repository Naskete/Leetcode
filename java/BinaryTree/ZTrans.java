package BinaryTree;

import java.util.*;

public class ZTrans {
    // 103 https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal
   public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        TreeNode node = root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);
        int flag = 0;
        while (!queue.isEmpty()) {
            int size  = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            flag += 1;
            if (flag % 2 == 0) {
                Collections.reverse(list);
            }
            result.add(list);
        }
        return result;
    }

    // binary tree level order traversal 
   public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        TreeNode node = root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);
        int flag = 0;
        while (!queue.isEmpty()) {
            int size  = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            flag += 1;
            if (flag % 2 == 0) {
                Collections.reverse(list);
            }
            result.add(list);
        }
        return result;
    }
}
