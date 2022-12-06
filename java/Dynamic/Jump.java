package Dynamic;

public class Jump {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return true;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            if (dp[i] == 0) {
                return false;
            }
            if (i + nums[i] >= n) {
                return true;
            }
            for (int j = i + 1; j <= i + nums[i]; j++) {
                dp[j] = 1;
            }
        }
        return dp[n - 1] == 1;
    }

    public boolean CanJump(int[] nums) {
        int n = nums.length;
        int rightmost = 0;
        for (int i = 0; i < n; ++i) {
            if (i <= rightmost) {
                rightmost = Math.max(rightmost, i + nums[i]);
                if (rightmost >= n - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
