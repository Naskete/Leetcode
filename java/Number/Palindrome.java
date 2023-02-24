package Number;

// 9 https://leetcode.com/problems/palindrome-number
public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int y = 0;
        int z = x;
        while (x > 0) {
            int mod = x % 10;
            x = x/10;
            y = y * 10 + mod;
        }
        return y == z;
    }
}
