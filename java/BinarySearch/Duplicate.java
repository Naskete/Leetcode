package BinarySearch;

import java.util.Arrays;
public class Duplicate {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i- 1]) {
                return nums[i];
            }
        }
        return 0;
    }

    // 不能更改原数组（假设数组是只读的）。
    // 只能使用额外的O(1)的空间。
    // 时间复杂度小于O(n*n)
    // 数组中只有一个重复的数字，但它可能不止重复出现一次。

    // 二分法
    public int findDuplicateI(int[] nums) {
        int len = nums.length;
        int left = 1, right = len - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            int cut = 0;
            for (int i = 0; i < len; i++) {
                if (nums[i] <= mid) {
                    cut++;
                }
            }
            if (cut > mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
