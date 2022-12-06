package String;

public class LCP {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int len = Math.min(pre.length(), strs[i].length());
            int j = 0;
            while (j < len) {
                if (pre.charAt(j) == strs[i].charAt(j)) {
                    j++;
                } else {
                    break;
                }
            }
            pre = pre.substring(0, j);
        }
        return pre;
    }
}
