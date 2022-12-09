package Number;

// https://leetcode.cn/problems/check-if-number-is-a-sum-of-powers-of-three/
public class Three {
    public boolean checkPowersOfThree(int n) {
        while (n != 0) {
            if (n % 3 == 2) {
                return false;
            }
            n /= 3;
        }
        return true;
    }
}
