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
        int p = 0, q = 0, r = 1;
        for(int i = 0; i < n; i++){
            p = q;
            q = r;
            r = q + p;
        }
        return r;      
    }
}
