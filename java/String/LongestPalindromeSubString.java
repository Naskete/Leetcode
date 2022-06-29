package String;
class LongestPalindromeSubString {
    public String longestPalindrome(String s) {
        if (s.length() == 1 || isPalindromic(s)) return s;
        int max = 1;
        String res = "";
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (isPalindromic(sub)) {
                    if (sub.length() > max) {
                        flag = true;
                        max = sub.length();
                        res = sub;
                    }
                }
            }
        }
        return flag ? res : String.valueOf(s.charAt(0));
    }
    
    public boolean isPalindromic(String s) {
        int len = s.length();
        int i = 0, j = len -1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}