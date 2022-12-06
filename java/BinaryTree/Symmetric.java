package BinaryTree;

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
}
