package String;

public class Roman {
    // 13. Roman to Integer
    public int romanToInt(String s) {
        char[] arr = s.toCharArray();
        int res = 0;
        int idx = 0, n = arr.length;
        while (idx < n) {
            int val = arr[idx];
            if (val == 'I') {
                if (idx + 1 < n) {
                    if (arr[idx + 1] == 'V') {
                        res += 4;
                        idx += 2;
                    } else if (arr[idx + 1] == 'X') {
                        res += 9;
                        idx += 2;
                    } else {
                        res += 1;
                        idx++;
                    }
                } else {
                    res += 1;
                    idx++;
                }
            } else if (val == 'V') {
                res += 5;
                idx++;
            } else if (val == 'X') {
                if (idx + 1 < n) {
                    if (arr[idx + 1] == 'L') {
                        res += 40;
                        idx += 2;
                    } else if (arr[idx + 1] == 'C') {
                        res += 90;
                        idx += 2;
                    } else {
                        res += 10;
                        idx++;
                    }
                } else {
                    res += 10;
                    idx++;
                }
            } else if (val == 'L') {
                res += 50;
                idx++;
            } else if (val == 'C') {
                if (idx + 1 < n) {
                    if (arr[idx + 1] == 'D') {
                        res += 400;
                        idx += 2;
                    } else if (arr[idx + 1] == 'M') {
                        res += 900;
                        idx += 2;
                    } else {
                        res += 100;
                        idx++;
                    }
                } else {
                    res += 100;
                    idx++;
                }
            } else if (val == 'D') {
                res += 500;
                idx++;
            } else if (val == 'M') {
                res += 1000;
                idx++;
            }
        }
        return res;
    }
}
