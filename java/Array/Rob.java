package Array;

public class Rob {
    // recurse  time out
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return process(nums, 0, nums.length, 0);
    }

    public int process(int[] nums, int idx, int len, int ans) {
        if (idx >= len) { // 返回答案
            return ans;
        }
        // 拿 idx 从idx + 2 ...
        int get = process(nums, idx + 2, len, ans + nums[idx]); 
        // 不拿idx 从 idx + 1 ...
        int noGet = process(nums, idx + 1, len, ans);
        return Math.max(get, noGet);
    }

    // dp
    public int robI(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        if (n == 1) {
            return nums[0];
        } 
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[n - 1];
    }
}
