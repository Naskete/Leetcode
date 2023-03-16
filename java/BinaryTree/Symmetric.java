package BinaryTree;

import java.util.*;

public class Symmetric {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }
    
    public boolean isSymmetric(TreeNode root, TreeNode tree) {
        if (root == null && tree == null) {
            return true;
        } else {
            if (root != null && tree != null) {
                boolean flag = root.val == tree.val;
                 return flag && isSymmetric(root.left, tree.right) && isSymmetric(root.right, tree.left);
            } else {
                return false;
            }
        }
    }
    public boolean check(TreeNode p, TreeNode q){
        // if(p==null && q==null){
        //     return true;
        // }
        // if(p==null || q==null){
        //     return false;
        // }
        // return p.val==q.val&&check(p.left, q.right)&&check(p.right, q.left);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(p);
        queue.offer(q);
        while(!queue.isEmpty()){
            p = queue.poll();
            q = queue.poll();
            if(p == null && q == null){
                continue;
            }
            if(p == null || q == null || q.val != p.val){
                return false;
            }
            queue.add(p.left);
            queue.add(q.right);
            queue.add(p.right);
            queue.add(q.left);
        }
        return true;
    }
}
