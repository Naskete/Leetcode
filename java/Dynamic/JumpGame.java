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

    // 贪心
    public boolean jumpGame(int[] nums) {
        int len = nums.length;
        int arrive = 0;
        for (int i = 0; i < len; i++) {
            if (i <= arrive) {
                arrive = Math.max(arrive, nums[i] + i);
                if (arrive >= len - 1) return true;
            }
        }
        return false;
    }
}
