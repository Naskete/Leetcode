package BinaryTree;

public class ValidBST {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean left = true, right = true;
        if (root.left != null) {
            left = root.val > getMax(root.left);
        }
        if (root.right != null) {
            right = root.val < getMin(root.right);
        }
        return left && right && isValidBST(root.left) && isValidBST(root.right);
    }
    
    public int getMax(TreeNode root) {
        int leftmax = Integer.MIN_VALUE, rightmax = Integer.MIN_VALUE;;
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            leftmax = Math.max(root.val, getMax(root.left));
            rightmax = Math.max(root.val, getMax(root.right));
        }
        return Math.max(leftmax, rightmax);
    }
    
    public int getMin(TreeNode root) {
        int leftmin = Integer.MAX_VALUE, rightmin = Integer.MAX_VALUE;;
        if (root == null) {
            return Integer.MAX_VALUE;
        } else {
            leftmin = Math.min(root.val, getMin(root.left));
            rightmin = Math.min(root.val, getMin(root.right));
        }
        return Math.min(leftmin, rightmin);
    }
}
