package struct;

import java.util.Stack;

public class CQueue {
    private Stack<Integer> pushStack;
    private Stack<Integer> popStack;

    public CQueue() {
        this.pushStack = new Stack<>();
        this.popStack = new Stack<>();
    }
    
    public void appendTail(int value) {
        pushToPop();
        pushStack.push(value);
    }

    public int deleteHead() {
        pushToPop();
        if (pushStack.isEmpty() && popStack.isEmpty()) {
            return -1;
        }
        return popStack.pop();
    }

    public void pushToPop() {
        if (!popStack.isEmpty()) {
            return;
        }
        while (pushStack.size() > 0) {
            popStack.push(pushStack.pop());
        }
    }
}
