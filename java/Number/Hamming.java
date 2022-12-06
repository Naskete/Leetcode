package Number;

// https://leetcode.cn/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
public class Hamming {
    public int hammingWeight(int n) {
        int ans = 0;
        int rightOne = n & (~n + 1);
        while (n != 0) {
            ans++;
            n = n ^ rightOne;
            rightOne = n & (~n + 1);
        }
        return ans;
    }
}
