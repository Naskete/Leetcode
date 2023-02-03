package BinaryTree;

import java.util.ArrayList;

//129. https://leetcode.cn/problems/sum-root-to-leaf-numbers/
public class SumRoot {
    public int sumNumbers(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        sumNodes(root, 0, arr);
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        return sum;
    }

    public void sumNodes(TreeNode root, int sum, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            arr.add(sum * 10 + root.val);
            return;
        }
        sumNodes(root.left, sum * 10 + root.val, arr);
        sumNodes(root.right, sum * 10 + root.val, arr);
    }
}
