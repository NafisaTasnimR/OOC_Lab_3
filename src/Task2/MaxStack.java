package Task2;

import java.util.Stack;

public class MaxStack {
    private Stack<Integer> MainStack;
    private Stack<Integer> MinStack;
    private Stack<Integer> MaxStack;

    public MaxStack() {
        MainStack = new Stack<>();
        MinStack = new Stack<>();
        MaxStack = new Stack<>();
    }

    public void push(int x) {
        MainStack.push(x);

        if (MinStack.isEmpty() || x <= MinStack.peek()) {
            MinStack.push(x);
        }
        if (MaxStack.isEmpty() || x >= MaxStack.peek()) {
            MaxStack.push(x);
        }
    }

    public int pop() {
        if (MainStack.isEmpty()) {
            throw new RuntimeException("Empty stack");
        }
        int val = MainStack.pop();

        if (val == MinStack.peek()) {
            MinStack.pop();
        }
        if (val == MaxStack.peek()) {
            MaxStack.pop();
        }
        return val;
    }

    public int max() {
        if (MaxStack.isEmpty()) {
            throw new RuntimeException("Empty stack");
        }
        return MaxStack.peek();
    }

}
