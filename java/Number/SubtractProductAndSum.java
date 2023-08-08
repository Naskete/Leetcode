package Number;

// https://leetcode.cn/problems/subtract-the-product-and-sum-of-digits-of-an-integer
class Solution {
    public int subtractProductAndSum(int n) {
        int mult = 1, sum = 0;
        while (n > 0) {
            int mod = n % 10;
            n = n / 10;
            mult *= mod;
            sum += mod;
        }
        return mult - sum;
    }
}