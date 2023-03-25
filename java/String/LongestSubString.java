package String;

// 2311  Longest Binary Subsequence Less Than or Equal to K
public class LongestSubString {
    public int longestSubsequence(String s, int k) {
        char[] array = s.toCharArray();
        int res = 0;
        for (char c : array) {
            if (c == '0') res++;
        }
        int len = array.length;
        long n = 1;
        int sum = 0;
        for (int i = len - 1; i >= 0; i--, n <<= 1) {
            if (array[i] == '1') sum += n;
            if (sum > k) break;
            if (array[i] == '1') res++;
            if (n > 1e9 + 1) return res;
        }
        return res;
    }
}
