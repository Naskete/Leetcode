package String;
class LongestPalindromeSubString {
    public String longestPalindrome(String s) {
        if (s.length() == 1 || isPalindrome(s)) return s;
        String ans = "";
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub)) {
                    ans = sub.length() > max ? sub : ans;
                    max = ans.length();
                }
            }
        }
        return ans;
    }

    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 1) return true;
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public String longestPalindromeDP(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        String ans = String.valueOf(s.charAt(0));

        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++)
                dp[i][j] = true;
        }

        // dp[i][j] = dp[i + 1][j - 1] && s[i] == s[j]
        for (int i = len - 2; i >= 0; i--) {
            for (int j = len -1; j >  i; j--) {
                dp[i][j] = dp[i + 1][j - 1] && (s.charAt(i) == s.charAt(j));
            }
        }
        int maxi = 0, maxj = 0, max = 0;
        for (int i = 0; i < len; i++) {
            for (int j = len -1; j > i; j--) {
                if (dp[i][j] && j - i > max) {
                    max = j - i;
                    maxi = i;
                    maxj = j;
                }
            }
        }
        ans = s.substring(maxi, maxj + 1);
        return ans;
    }
}