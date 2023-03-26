package String;

import java.util.*;

// 224. basic calculate
public class BasicCalculator {
    public int basicCalculate(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        int sign = 1;
        int idx = 0;
        char[] array = s.toCharArray();
        int n = array.length;
        int res = 0;
        while (idx < n) {
            if (array[idx] == '+') {
                sign = stack.peek();
                idx++;
            } else if (array[idx] == '-') {
                sign = -stack.peek();
                idx++;
            } else if (array[idx] == '(') {
                stack.push(sign);
                idx++;
            } else if (array[idx] == ')') {
                sign = stack.pop();
                idx++;
            } else if (Character.isDigit(array[idx])) {
                int num = 0;
                while (idx < n && Character.isDigit(array[idx])) {
                    num = num * 10 + (array[idx] - '0');
                    idx++;
                }
                res += sign * num;
            } else {
                idx++;
            }
        }
        return res;
    }

    // 面试 16.26 
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int sign = 1;
        int idx = 0;
        char[] array = s.toCharArray();
        int n = array.length;
        int res = 0;
        int num = 0;
        while (idx < n) {
            if (Character.isDigit(array[idx])) {
                while (idx < n && Character.isDigit(array[idx])) {
                    num = num * 10 + (array[idx] - '0');
                    idx++;
                }
                idx--;
                if (sign <= 1) {
                    stack.push(sign * num);
                } else {
                    if (sign == 2) {
                        stack.push(stack.pop() * num);
                    } else {
                        stack.push(stack.pop() / num);
                    }
                }
            }  else {
                if (array[idx] == '+') {
                    sign = 1;
                } else if (array[idx] == '-') {
                    sign = -1;
                } else if (array[idx] == '*') {
                    sign = 2;
                } else if (array[idx] == '/') {
                    sign = 3;
                }
                num = 0;
            }
            idx++;
        }
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }
}
