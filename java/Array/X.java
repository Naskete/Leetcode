package Array;

// 2319. https://leetcode.cn/problems/check-if-matrix-is-x-matrix/
public class X {
    public boolean checkXMatrix(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][i] == 0 || grid[i][grid.length - i - 1] == 0) {
                return false;
            }
            for (int j = 0; j < grid.length; j++) {
                if (j == i || j == grid.length - i - 1) {
                    continue;
                }
                if (grid[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
