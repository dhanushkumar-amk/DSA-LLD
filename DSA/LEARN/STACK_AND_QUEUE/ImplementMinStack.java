package DSA.LEARN.STACK_AND_QUEUE;

import java.util.Stack;

class Pair {
    int value;
    int min;

    Pair(int value, int min) {
        this.value = value;
        this.min = min;
    }
}

public class ImplementMinStack {

    static class MinStack {
        Stack<Pair> stack;

        public MinStack() {
            stack = new Stack<>();
        }

        public void push(int val) {
            if (stack.isEmpty()) {
                stack.push(new Pair(val, val));
            } else {
                int currentMin = Math.min(val, stack.peek().min);
                stack.push(new Pair(val, currentMin));
            }
        }

        public void pop() {
            if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        public int top() {
            if (!stack.isEmpty()) {
                return stack.peek().value;
            }
            return -1;
        }

        public int getMin() {
            if (!stack.isEmpty()) {
                return stack.peek().min;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        MinStack st = new MinStack();

        st.push(5);
        st.push(3);
        st.push(7);
        st.push(2);

        System.out.println(st.getMin()); // 2
        st.pop();
        System.out.println(st.getMin()); // 3
    }
}