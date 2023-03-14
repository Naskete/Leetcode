package BinaryTree;

import java.util.*;

public class PathSum {
    // 129. https://leetcode.com/problems/sum-root-to-leaf-numbers/
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        List<Integer> nums = new ArrayList<>();
        int sum = 0;
        getNumber(root, 0, nums);
        for (Integer num : nums) {
            sum += num;
        }
        return sum;
    }

    public void getNumber(TreeNode root, int val, List<Integer> list) {
        if (root.left == null && root.right == null) {
            val = val * 10 + root.val;
            list.add(val);
            return;
        }
        val = val * 10 + root.val;
        if (root.left != null) {
            getNumber(root.left, val, list);
        }
        if (root.right != null) {
            getNumber(root.right, val, list);
        }
    }

    // offical Soulution
    public int sumNumbersI(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int prevSum) {
        if (root == null) {
            return 0;
        }
        int sum = prevSum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        } else {
            return dfs(root.left, sum) + dfs(root.right, sum);
        }
    }
}
