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


        System.out.println("Priority Queue");
        // priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(1);
        priorityQueue.offer(21);
        priorityQueue.offer(3);
        priorityQueue.offer(4);
        priorityQueue.offer(0);


        List<Integer> top2 = new LinkedList<>();
        int index = 0;
        while (!priorityQueue.isEmpty()){

            if (index == 2)
                break;
            top2.add(priorityQueue.poll());
            index++;
        }

        // default min heap
        System.out.println(top2);
        System.out.println(priorityQueue);


        List<StudentMarks> studentMarks = new ArrayList<>();
        // get the top3 student based on marks

        studentMarks.add(new StudentMarks(20, 30));
        studentMarks.add(new StudentMarks(70, 80));
        studentMarks.add(new StudentMarks(50, 90));
        studentMarks.add(new StudentMarks(80, 89));
        studentMarks.add(new StudentMarks(74, 36));

        PriorityQueue<StudentMarks> studentMarksPriorityQueue = new PriorityQueue<>(studentMarks);

        List<StudentMarks> top3 = new LinkedList<>();
        int indexRange = 0;
        while (!studentMarksPriorityQueue.isEmpty()){

            if (indexRange == 3)
                break;
            top3.add(studentMarksPriorityQueue.poll());
            indexRange++;
        }

        System.out.println(top3);

        // compartable class in an anamous function with lambda
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>( (a, b) -> b - a);

    }
}

class  StudentMarks implements Comparable<StudentMarks> {
    private int maths;
    private int science;

    @Override
    public String toString() {
        return "StudentMarks{ \n " +
                "maths=" + maths +
                ", science=" + science +
                '}' + "\n";
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public StudentMarks(int maths, int science) {
        this.maths = maths;
        this.science = science;
    }

    @Override
    public int compareTo(StudentMarks o) {
        /*
        * current object < other object
        *   return negative number
        *
        * current object > other object
        *   return positive number
        *
        * current object == other object
        *   return 0;
        * */

        /*
        if (this.maths < o.science)
            return -1;

        if (this.maths > o.maths)
            return 1;

        if (this.maths == o.maths)
            return 0;
       */

//        this above three line can be return in one line
        // for ascending order we use this.math - o.math
        // for descending order we use o.math - this.math;

        return o.maths - this.maths;
    }

}

class MyCustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1; // descending order
    }
}
