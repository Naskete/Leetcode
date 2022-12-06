package DFSIsland;

import java.util.HashMap;
import java.util.Map;

public class LargestIsland {
    public int largestIsland(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int m = grid.length, n = grid[0].length;
        Map<Integer, Integer> map = new HashMap<>();
        int color = 2;
        // 统计所有岛屿的面积
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 1) {
                    int area = dfs(grid, r, c, color);
                    map.put(color, area);
                    color++;
                }
            }
        }
        int area = 0;
        // 尝试把0变成1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    // 判断上下左右
                    int color1 = 0, color2 = 0, color3 = 0, color4 = 0;
                    int ans = 1;
                    if (i >= 1 && grid[i - 1][j] != 0) {
                        color1 = grid[i - 1][j];
                        ans += map.get(color1);
                    }
                    if (i < m - 1 && grid[i + 1][j] != 0) {
                        color2 = grid[i + 1][j];
                        if (color2 != color1) ans += map.get(color2);
                    }
                    if (j >= 1 && grid[i][j - 1] != 0) {
                        color3 = grid[i][j - 1];
                        if (color3 != color1 && color3 != color2) ans += map.get(color3);
                    }
                    if (j < n - 1 && grid[i][j + 1] != 0) {
                        color4 = grid[i][j + 1];
                        if (color4 != color1 && color4 != color2 && color4 != color3) ans += map.get(color4);
                    }
                    area = area > ans ? area : ans;
                }
            }
        }
        if (area == 0) { // 没有0
            area = map.get(2);
        }
        return area;
    }

    public int dfs(int[][] grid, int r, int c, int color) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) {
            return 0;
        }
        if (grid[r][c] != 1) {
            return 0;
        }
        grid[r][c] = color;
        return 1 + dfs(grid, r + 1, c, color) 
            + dfs(grid, r - 1, c, color)
            + dfs(grid, r, c + 1, color)
            + dfs(grid, r, c - 1, color);
    }
}
