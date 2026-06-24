package DSA.PRATICE.NEETCODE_150;

public class MinStack {

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

    }

    public static void pop() {

    }

    public static int top() {
        return 0;
    }

    public static int getMin() {
        return 0;
    }
}