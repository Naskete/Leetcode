package Array;

public class Area {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1){
                    int a = gcd(grid, i, j);
                    ans = Math.max(ans, a);
                }
            }
        }
        return ans;
    }

    public int gcd(int[][] grid, int x, int y) {
        int m = grid.length, n = grid[0].length;
        if (x < 0 || x >= m || y < 0 || y >= n) {
            return 0;
        }
        if (grid[x][y] != 1) {
            return 0;
        }
        grid[x][y] = 0;
        return 1 + gcd(grid, x -1, y) 
        + gcd(grid, x, y - 1)
        + gcd(grid, x + 1, y)
        + gcd(grid, x, y + 1);
    }
}
