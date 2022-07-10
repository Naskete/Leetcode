package BinaryTree;

public class ValidBST {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long low, long up) {
        if (root == null) {
            return true;
        }
        if (root.val <= low || root.val >= up) {
            return false;
        }
        return isValidBST(root.left, low, root.val) && isValidBST(root.right, root.val, up);
    }
}
