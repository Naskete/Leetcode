package Dynamic;

public class Fib {
    public int fib(int n) {
        int p = 0, q = 1, r = 0;
        for (int i = 0; i < n; i++) {
            r = p + q;
            q = p;
            p = r;
        }
        return r;
    }

    static final int MOD = 1000000007;
    public int fibonacci(int n) {
       if (n < 2) {
           return n;
       }
       int[][] m = {{1, 1}, {1, 0}};
       int[][] ret = pow(m, n - 1);
       return ret[0][0];
    }

    int[][] pow(int[][] m, int n) {
        int[][] ans = {{1,0}, {0, 1}}; // 单位矩阵
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = mult(ans, m);
            }
            m = mult(m, m);
            n /= 2;
        }
        return ans;
    }

    int[][] mult(int[][] a, int[][] b) {
        int[][] res = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                res[i][j] = (int) (((long)a[i][0] * b[0][j] + (long)a[i][1] * b[1][j]) % MOD);
            }
        }
        return res;
    }
}
