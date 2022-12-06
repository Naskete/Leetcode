package DFSIsland;

public class MaxArea {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null ||grid.length == 0) {
            return 0;
        }
        int m = grid.length, n = grid[0].length;
        int max = 0;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 1) {
                    int area = Area(grid, r, c);
                    max = max > area ? max : area;
                }
            }
        }
        return max;
    }

    public int Area(int[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) {
            return 0;
        }
        if (grid[r][c] == 0) {
            return 0;
        }
        grid[r][c] = 0;
        return 1 + Area(grid, r + 1, c) 
            + Area(grid, r - 1, c)
            + Area(grid, r, c + 1)
            + Area(grid, r, c - 1);
    }
}
