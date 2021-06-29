package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
    List<IntItem> stack = new ArrayList<>();

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin();
        minStack.pop();
        minStack.top();
        minStack.getMin();
        Math.max(1, 2);
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.add(new IntItem(val, val));
            return;
        }
        stack.add(new IntItem(val, Math.min(val, stack.get(stack.size() - 1).min)));
    }

    public void pop() {
        stack.remove(stack.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1).val;
    }

    public int getMin() {
        return stack.get(stack.size() - 1).min;
    }

    class IntItem {
        int val;
        int min;

        IntItem(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }
}