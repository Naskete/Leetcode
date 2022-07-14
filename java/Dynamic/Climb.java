package Dynamic;
public class Climb {
    // 递归 超时
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        } else if(n==2){
            return 2;
        } else {
            return climbStairs(n-1) + climbStairs(n-2);
        }        
    }
    // 动态规划 滚动数组
    public int climbStairsI(int n) {
        int p = 1, q = 1, r = 1;
        for (int i = 1; i < n; i++) {
            r = p + q;
            q = p;
            p = r;
        }
        return r;
        // if (n <= 2) {
        //     return n;
        // } else {
        //     return climbStairs(n - 1) + climbStairs(n - 2);
        // }     
    }
}
