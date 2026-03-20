package DSA.LEARN.STACK_AND_QUEUE;

public class StackImplementUsingArrays {

    static class StackImplementation {
        int top = -1;
        int capacity = 10;
        int[] stack = new int[capacity];

        // push function
        public void push(int element) {
            if (top == capacity - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            stack[++top] = element;
        }

        // top function
        public int top() {
            if (top == -1)
                return -1;

            return stack[top];
        }

        // pop function
        public int pop() {
            if (top == -1)
                return -1;

            return stack[top--];
        }

        // size function
        public int size() {
            return top + 1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == capacity - 1;
        }
    }

    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("top element " + stack.top());
        System.out.println("size of stack : " + stack.size());

        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
    }
}