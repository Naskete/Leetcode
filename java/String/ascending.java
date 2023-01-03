package String;

// https://leetcode.cn/problems/check-if-numbers-are-ascending-in-a-sentence/
public class ascending {
    public boolean areNumbersAscending(String s) {
        int pre = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            StringBuilder str = new StringBuilder();
            while (i < arr.length && arr[i] <= '9' && arr[i] >= '0') {
                str.append(arr[i]);
                i++;
            }
            if (str.length() > 0) {
                int cur = Integer.parseInt(str.toString());
                if (cur <= pre) {
                    return false;
                } else {
                    pre = cur;
                    str = new StringBuilder();
                }
            }
        }
        return true;
    }
}
