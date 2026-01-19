package DSA.LEARN.COLLECTION_FRAMEWORK;

import java.util.*;

public class QueueCollection {
    public static void main(String[] args) {

        // FIFO QUEUE
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.isEmpty());


        // LIFO
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack);
        System.out.println(stack.isEmpty());


        // double side queue
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerFirst(1);
        deque.offerFirst(2);

        deque.offerLast(3);
        deque.offerLast(4);

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque);


    }
}
