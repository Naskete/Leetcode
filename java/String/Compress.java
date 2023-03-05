package String;

public class Compress {
    // 443. https://leetcode.com/problems/string-compression
    public int compress(char[] chars) {
        int len = chars.length;
        if (len == 1) {
            return 1;
        }
        int l = 0, r = 1;
        int idx = 0;
        while (l < len) {
            while (r < len && chars[r] == chars[l]) {
                r++;
            }
            int length = r - l;
            chars[idx++] = chars[l];
            if (length > 1) {
                String s = String.valueOf(length);
                char[] nums = s.toCharArray();
                for (char num : nums) {
                    chars[idx++] = num;
                }
            }
            l = r;
            r++;
        }
        return idx;
    }
}
