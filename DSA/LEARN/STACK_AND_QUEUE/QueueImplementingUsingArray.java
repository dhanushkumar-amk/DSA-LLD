package DSA.LEARN.STACK_AND_QUEUE;

public class QueueImplementingUsingArray {

    static class Queue {
        int front, rear, size, capacity;
        int[] arr;

        public Queue(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        // enqueue
        public void enqueue(int x) {
            if (isFull()) {
                System.out.println("Queue Overflow");
                return;
            }
            rear = rear + 1;
            arr[rear] = x;
            size++;
        }

        // dequeue
        public int dequeue() {
            if (isEmpty()) {
                return -1;
            }
            int val = arr[front];
            front = front + 1;
            size--;
            return val;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return arr[front];
        }

        // isEmpty
        public boolean isEmpty() {
            return size == 0;
        }

        // isFull
        public boolean isFull() {
            return size == capacity;
        }

        // size
        public int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());
        System.out.println(q.peek());

        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        System.out.println(q.size());
    }
}