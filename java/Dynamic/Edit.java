package Dynamic;

public class Edit {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        if (m * n == 0) {
            return m + n;
        }
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) dp[i][0] = i;
        for (int i = 1; i <= n; i++) dp[0][i] = i;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (w1[i - 1] == w2[j - 1]) {
                    dp[i][j] = dp[i-1][j-1];
                    continue;
                }
                // 替换
                dp[i][j] = Math.min(dp[i][j], dp[i-1][j-1] + 1);
                // 删除
                dp[i][j] = Math.min(dp[i][j], dp[i-1][j] + 1);
                // 插入
                dp[i][j] = Math.min(dp[i][j], dp[i][j-1] + 1);
            }
        }
        return dp[m][n];
    }
}
