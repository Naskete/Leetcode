package Dynamic;

// https://leetcode.cn/problems/unique-paths/
public class DifferentRoute {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            dp[0][i] = dp[0][0];
        }
        for (int i = 0; i < m; i++) {
            dp[i][0] = dp[0][0];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m - 1][n - 1];
    } 
}
