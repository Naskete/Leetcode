package Array;

// https://leetcode.cn/problems/sort-colors/
public class SortColor {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int zero = -1, two = len;
        if (len <= 1) return;
        int idx = 0;
        while (idx < two) {
            if (nums[idx] < 1) {
                swap(nums, ++zero, idx++);
            } else if(nums[idx] > 1) {
                swap(nums, --two, idx);
            } else {
                idx++;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
