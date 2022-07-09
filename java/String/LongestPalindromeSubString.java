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
}