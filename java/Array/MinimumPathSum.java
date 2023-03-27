package Array;

public class MinimumPathSum {
    // 64 mininum path sum
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] costs = new int[m][n];
        costs[0][0] = grid[0][0];
        for (int i = 1; i < n; i++) {
             costs[0][i] = costs[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < m; i++) {
            costs[i][0] = costs[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i< m; i++) {
            for (int j = 1; j < n; j++) {
                costs[i][j] = grid[i][j] + Math.min(costs[i - 1][j], costs[i][j - 1]);
            }
        }
        return costs[m - 1][n - 1];
    }

    // time out
    public int minSum(int[][] grid, int m, int n, int curX, int curY, int sum) {
        if (curX >= m || curY >= n) {
            return Integer.MAX_VALUE;
        }
        if (curX == m - 1 &&curY == n - 1) {
            sum += grid[curX][curY];
            return sum;
        }
        sum += grid[curX][curY];
        int right = minSum(grid, m, n, curX, curY + 1, sum);
        int down = minSum(grid, m, n, curX + 1, curY, sum);
        return Math.min(right, down);
    }
}
