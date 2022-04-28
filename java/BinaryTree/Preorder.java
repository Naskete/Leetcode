package BinaryTree;

import java.util.*;

public class Preorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traversal(root, list);
        return list;
    }
    public void traversal(TreeNode root, List<Integer> list){
        if(root==null) return;
        list.add(root.val);
        traversal(root.left, list);
        traversal(root.right, list);
    }

    // 迭代
    public List<Integer> perorder(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(!stack.empty() || node != null){
            while(node != null){
                list.add(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
        return list;
    }
}
