package Number;

// 69. https://leetcode.cn/problems/sqrtx/
public class Sqrt {
    public int mySqrt(int x) {
        double z = 1.0, pre = 0.0;
        while (Math.abs(z - pre) > 0.1) {
            pre = z;
            z -= (z * z - x) / (2 * z);
        }
        return (int)z;
    }
}
