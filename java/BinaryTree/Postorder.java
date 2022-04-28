package BinaryTree;

import java.util.*;

public class Postorder {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traversal(root, list);
        return list;
    }
    public void traversal(TreeNode root, List<Integer> list){
        if(root==null) return;
        traversal(root.left, list);
        traversal(root.right, list);
        list.add(root.val);
    }

     // 迭代
     public List<Integer> perorder(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while(!stack.empty() || root != null){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(root.right == null || root.right== pre){ // 访问过右子树
                list.add(root.val);
                pre = root;
                root = null;
            } else { // 未访问右子树
                stack.push(root);
                root = root.right;
            }
        }
        return list;
    }
}
