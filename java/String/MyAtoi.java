package String;

public class MyAtoi {
    // 8 myAtoi
    public int myAtoi(String s) {
        int idx = 0, n = s.length();
        char[] str = s.toCharArray();
        long res = 0, sign = 1;
        while (idx < n && str[idx] == ' ') idx++;
        if (idx >= n || (str[idx] != '+' && str[idx] != '-' && !Character.isDigit(str[idx]))) return 0;
        if (str[idx] == '-') {
            sign = -1;
            idx++;
        } else if (str[idx] == '+') {
            idx++;
        }
        while (idx < n && Character.isDigit(str[idx])) {
            res = res*10+sign*(str[idx++]-'0');
            if (res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return (int)res;
    }
}
