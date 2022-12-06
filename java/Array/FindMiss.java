package Array;

import java.util.Arrays;

public class FindMiss {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int idx = 0;
        int n = nums.length;
        while(idx < n && nums[idx]<=0) {
            idx++;
        }
        int i = 1;
        while(idx < n && nums[idx] == i) {
            idx++;
            if (idx < n && nums[idx] == nums[idx - 1]) {
                continue;
            }
            i++;
        }
        return i;
    }

    public int firstMissingPositiveI(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] <= 0) {
                nums[i] = n + 1;
            }
        }
        for (int i = 0; i < n; ++i) {
            int num = Math.abs(nums[i]);
            if (num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }
        for (int i = 0; i < n; ++i) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }
}
