package struct;

import java.util.Stack;

// https://leetcode.cn/problems/min-stack/
class MinStack {

    private Stack<Integer> data;
    private Stack<Integer> minV;

    public MinStack() {
        this.data = new Stack<>();
        this.minV = new Stack<>();
    }
    
    public void push(int x) {
        data.push(x);
        if (minV.isEmpty()) {
            minV.push(x);
        } else {
            if (x >= minV.peek()) {
                minV.push(minV.peek());
            } else {
                minV.push(x);
            }
        }
    }
    
    public void pop() {
        data.pop();
        minV.pop();
    }
    
    public int top() {
        return data.peek();
    }
    
    public int min() {
        return minV.peek();
    }
}