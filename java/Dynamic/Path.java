package Dynamic;

// 63.https://leetcode.cn/problems/unique-paths-ii/
public class Path {
    // timeout
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        return walk(obstacleGrid, 0, 0, m - 1, n - 1, m - 1, n - 1);
    }

    public int walk(int[][] arr, int cx, int cy, int tx, int ty, int m, int n) {
        if (cx == tx && cy == ty && arr[cx][cy] == 0) {
            return 1;
        }
        if (cx > m || cy > n) {
            return 0;
        }
        if (arr[cx][cy] == 1) {
            return 0;
        }
        return walk(arr, cx, cy + 1, tx, ty, m, n) // right
        + walk(arr, cx + 1, cy, tx, ty, m, n); // down
    }
}
