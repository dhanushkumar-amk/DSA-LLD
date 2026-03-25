package DSA.LEARN.STACK_AND_QUEUE;

public class QueueUsingLL {

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    Node start;
    Node end;
    int size = 0;

    // enqueue (push)
    public void push(int x) {
        Node newNode = new Node(x);

        if (start == null) {
            start = newNode;
            end = newNode;
        } else {
            end.next = newNode;
            end = newNode;
        }
        size++;
        System.out.println(x + " inserted");
    }

    // dequeue (pop)
    public void pop() {
        if (start == null) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println(start.value + " removed");
        start = start.next;
        size--;

        if (start == null) {
            end = null;
        }
    }

    // peek (front)
    public int top() {
        if (start == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return start.value;
    }

    // size
    public int getSize() {
        return size;
    }

    // display
    public void display() {
        Node temp = start;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // psvm
    public static void main(String[] args) {
        QueueUsingLL q = new QueueUsingLL();
        q.push(10);
        q.push(20);
        q.push(30);

        q.display();

        System.out.println("Front: " + q.top());
        System.out.println("Size: " + q.getSize());

        q.pop();
        q.display();

        System.out.println("Front: " + q.top());
        System.out.println("Size: " + q.getSize());
    }
}