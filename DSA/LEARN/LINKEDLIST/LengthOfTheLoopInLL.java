package DSA.LEARN.LINKEDLIST;

public class LengthOfTheLoopInLL {

    static class Node {
        public int data;
        public Node next;

        Node() {
            this.data = 0;
            this.next = null;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static int lengthOfLoop(Node head) {

        Node slowPointer = head;
        Node fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {

            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if (slowPointer == fastPointer) {

                int count = 1;
                Node temp = slowPointer.next;

                while (temp != slowPointer) {
                    count++;
                    temp = temp.next;
                }

                return count;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        fifth.next = third;

        int loopLength = lengthOfLoop(head);

        if (loopLength == 0) {
            System.out.println("No loop found");
        } else {
            System.out.println("Length of loop: " + loopLength);
        }
    }
}