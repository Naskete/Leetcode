package String;

// https://leetcode.cn/problems/ti-huan-kong-ge-lcof/
public class ReplaceSpace {
    public String replaceSpace(String s) {
        // return s.replace(" ", "%20");
        // return s.replaceAll(" ", "%20");
        char[] string = s.toCharArray();
        int len = s.length();
        char[] ans = new char[len * 3];
        int size = 0;
        for (int i = 0; i < len; i++) {
            if (string[i] == ' ') {
                ans[size++] = '%';
                ans[size++] = '2';
                ans[size++] = '0';
            } else {
                ans[size++] = string[i];
            }
        }
        String r = String.valueOf(ans, 0, size);
        return r;
    }
}
