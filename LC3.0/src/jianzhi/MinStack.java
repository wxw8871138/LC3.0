package jianzhi;

import java.util.Stack;

public class MinStack {
    Stack<Integer> mainStack;
    Stack<Integer> minStack;
    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (mainStack.pop() == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return mainStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
