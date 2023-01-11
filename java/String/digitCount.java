package String;

// https://leetcode.cn/problems/check-if-number-has-equal-digit-count-and-digit-value/
public class digitCount {
    public boolean count(String num) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = 0;
        }
        char[] chars = num.toCharArray();
        for (char c : chars) {
            int idx = Integer.parseInt(String.valueOf(c));
            arr[idx] += 1;
        }
        for (int i = 0; i < num.length(); i++) {
            if (arr[i] != Integer.parseInt(String.valueOf(chars[i]))) {
                return false;
            }
        }
        return true;
    }
}
