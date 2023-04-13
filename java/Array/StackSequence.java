package Array;

import java.util.Stack;

public class StackSequence {
    // 946. Validate Stack sequences
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> pushStack = new Stack<>();
        int p = 0, q = 0, m = pushed.length, n = popped.length;
        while (p < m) {
            while (!pushStack.isEmpty() && popped[q] == pushStack.peek()) {
                pushStack.pop();
                q++;
            }
            pushStack.push(pushed[p]);
            p++;
        }
        while (!pushStack.isEmpty() && pushStack.peek() == popped[q]) {
            pushStack.pop();
            q++;
        }
        return q == n && pushStack.isEmpty();
    }
}
