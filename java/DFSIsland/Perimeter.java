package DFSIsland;

public class Perimeter {
    public int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int m = grid.length, n = grid[0].length;
        int ans = 0;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 1) {
                    ans = getPerimeter(grid, r, c);
                }
            }
        }
        return ans;
    }

    public int getPerimeter(int[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) {
            return 1;
        }
        if (grid[r][c] == 0) {
            return 1;
        }

        if (grid[r][c] != 1) {
            return 0;
        }
        grid[r][c] = 2;
        return getPerimeter(grid, r + 1, c)
            + getPerimeter(grid, r - 1, c)
            + getPerimeter(grid, r, c + 1)
            + getPerimeter(grid, r, c - 1);
    }
}
