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

        if (MinStack.isEmpty() || x >= MinStack.peek()) {
            MinStack.push(x);
        }

        if (MaxStack.isEmpty() || x <= MaxStack.peek()) {
            MaxStack.push(x);
        }
    }

}
