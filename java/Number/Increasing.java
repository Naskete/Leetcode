package Number;

// https://leetcode.cn/problems/minimum-operations-to-make-the-array-increasing/
public class Increasing {
    public int minOperations(int[] nums) {
        if (nums.length <= 1) return 0;
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                continue;
            } else {
                res = res + nums[i - 1] + 1 - nums[i];
                nums[i] = nums[i - 1] + 1;
            }
        }
        return res;
    }
}
