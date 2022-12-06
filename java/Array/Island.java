package Array;

public class Island {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        if (m == 0) {
            return 0;
        }
        int n = grid[0].length;
        if (n == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j]=='1'){
                    count++;
                    gcd(grid, i, j);
                }
            }
        }
        return count;
    }

    public void gcd(char[][] grid, int x, int y) {
        int m = grid.length;
        int n = grid[0].length;
        grid[x][y] = '0';
        if (x >= 1 && grid[x-1][y] == '1') gcd(grid, x-1, y);
        if (x < m-1 && grid[x+1][y] == '1') gcd(grid, x+1, y);
        if (y >= 1 && grid[x][y-1] == '1') gcd(grid, x, y-1);
        if (y < n-1 && grid[x][y+1] == '1') gcd(grid, x, y+1);
    }
}
