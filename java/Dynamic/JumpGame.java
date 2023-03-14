package Dynamic;

public class JumpGame {
    // 55.jump game
    public boolean canJump(int[] nums) {
        int len = nums.length;
        boolean[] dp = new boolean[len + 1];
        dp[0] = true;
        for (int i = 0; i < len; i++) {
            if (!dp[i]) return false;
            int end = nums[i] + i;
            if (end >= len - 1) return true; // 这里是 len - 1
            for (int idx = i; idx <= end; idx++) {
                dp[idx] = true;
            } 
        } 
        return dp[len];
    }
}
