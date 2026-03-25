package DSA.LEARN.STACK_AND_QUEUE;

public class StackImplementUsingLL {

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    Node top;
    int size = 0;

    // push
    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println(x + " pushed");
    }

    // pop
    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(top.value + " popped");
        top = top.next;
        size--;
    }

    // peek (top)
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.value;
    }

    // size
    public int stackSize() {
        return size;
    }

    // display stack
    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // psvm (main method)
    public static void main(String[] args) {
        StackImplementUsingLL stack = new StackImplementUsingLL();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Top element: " + stack.peek());
        System.out.println("Size: " + stack.stackSize());

        stack.pop();
        stack.display();

        System.out.println("Top element: " + stack.peek());
        System.out.println("Size: " + stack.stackSize());
    }
}