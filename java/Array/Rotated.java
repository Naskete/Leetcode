package Array;

// 1752. https://leetcode.cn/problems/check-if-array-is-sorted-and-rotated/
public class Rotated {
    public boolean check(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return true;
        }
        int idx = 1;
        while (idx < n && nums[idx - 1] <= nums[idx]) idx++;
        if (idx == n) return true;
        if (nums[0] < nums[n - 1] || nums[idx - 1] < nums[n - 1]) return false;
        idx++;
        while (idx < n && nums[idx - 1] <= nums[idx]) idx++;
        return idx == n;
    }
}