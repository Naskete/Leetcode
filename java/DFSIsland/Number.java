package DFSIsland;

public class Number {
    public int numIslands(char[][] grid) {
        if (grid == null ||grid.length == 0) {
            return 0;
        }
        int m = grid.length, n = grid[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    ans++;
                    Islands(grid, i, j, m, n);
                }
            }
        }
        return ans;
    }

    public void Islands (char[][] grid, int x, int y, int m, int n) {
        if (x < 0 ||x >= m || y < 0 || y >= n) {
            return;
        }
        if (grid[x][y] == '0') {
            return ;
        }
        grid[x][y] = '0';
        Islands(grid, x + 1, y, m, n);
        Islands(grid,x - 1, y, m, n);
        Islands(grid, x, y + 1, m, n);
        Islands(grid, x , y - 1, m, n);
    }
}
