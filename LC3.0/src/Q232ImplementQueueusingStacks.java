import java.util.ArrayDeque;
import java.util.Deque;

public class Q232ImplementQueueusingStacks {
    Deque<Integer> inStack;
    Deque<Integer> outStack;
    public MyQueue() {
        inStack = new ArrayDeque<>();
        outStack = new ArrayDeque<>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        if (outStack.isEmpty()) {
            inToOut(inStack, outStack);
        }
        return outStack.pop();
    }

    public int peek() {
        if (outStack.isEmpty()) {
            inToOut(inStack, outStack);
        }
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    public void inToOut(Deque inStack, Deque outStack) {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }
}
