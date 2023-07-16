package v2;

import java.util.Stack;

//Execute in to out only if out stack is empty
public class MyQueue {
    Stack<Integer> inStack;
    Stack<Integer> outStack;


    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        if (outStack.isEmpty()) {
            inToOut();
        }
        return outStack.pop();
    }

    public int peek() {
        if (outStack.isEmpty()) {
            inToOut();
        }
        return outStack.peek();
    }

    public boolean empty() {
        if (outStack.isEmpty()) {
            inToOut();
        }
        return outStack.isEmpty();
    }

    private void inToOut() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }
}
