package String;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if ((s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{')
                        || (s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(')
                        || (s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return true && stack.isEmpty();
    }
}
