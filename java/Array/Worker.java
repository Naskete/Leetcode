package Array;

// 2432
public class Worker{
    public int hardestWorker(int n, int[][] logs) {
        int res = logs[0][0];
        int max = logs[0][1];
        int m = logs.length;
        if (m == 1) return res;
        for (int i = 1; i < m; i++) {
            int t = logs[i][1] - logs[i - 1][1];
            if (t > max) {
                max = t;
                res = logs[i][0];
            } else if (t == max) {
                res = Math.min(res, logs[i][0]);
            }
        }
        return res;
    }
}