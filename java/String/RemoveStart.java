package String;

import java.util.Stack;

public class RemoveStart {
    public String removeStars(String s) {
        if (s == null || s.length() == 0) return s;
        char[] string = s.toCharArray();
        int n = string.length;
        StringBuilder builder = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int idx = 0;
        while (idx < n) {
            if (string[idx] == '*') {
                stack.pop();
            } else {
                stack.push(string[idx]);
            }
            idx++;
        }
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }
        return builder.reverse().toString();
    }

    public String removeStarsI(String s) {
        int len = s.length();
        char[] chars = new char[len];
        int index = len, count = 0;

        for (int i = len - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '*') {
                count++;
            } else {
                if (count > 0) {
                    count--;
                } else {
                    chars[--index] = c;
                }
            }
        }
        return String.valueOf(chars, index, len - index);
    }
}
