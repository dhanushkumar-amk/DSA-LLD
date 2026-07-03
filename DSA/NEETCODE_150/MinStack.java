package DSA.NEETCODE_150;

import java.util.Stack;

public class MinStack {

    static Stack<Pair> stack = new Stack<>();

    public static void main(String[] args) {

        push(-2);
        push(0);
        push(-3);

        System.out.println(getMin()); // -3

        pop();

        System.out.println(top());    // 0
        System.out.println(getMin()); // -2
    }

    public static void push(int value) {

        Pair pair = new Pair();
        pair.value = value;

        if (stack.isEmpty()) {
            pair.min = value;
        } else {
            pair.min = Math.min(value, stack.peek().min);
        }

        stack.push(pair);
    }

    public static void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    public static int top() {
        return stack.peek().value;
    }

    public static int getMin() {
        return stack.peek().min;
    }
}

class Pair {
    int value;
    int min;
}