package String;

public class SumDigit {
    public int getLucky(String s, int k) {
        if (k < 0) {
            return Integer.parseInt(s);
        } else {
            if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') {
                StringBuilder sb = new StringBuilder();
                char[] arr = s.toCharArray();
                for (char c : arr) {
                    sb.append(c - 'a' + 1);
                }
                s = sb.toString();
            } else {
                int res = 0;
                char[] arr = s.toCharArray();
                for (char c : arr) {
                    res = res + (int)c - 48;
                }
                s = String.valueOf(res);
            }
            return getLucky(s, k - 1);
        }
    }
}
