package DSA.LEARN.LL;

public class RotateLinkedList {

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

    public static Node rotate(Node head, int k) {

        if (head == null || head.next == null)
            return head;

        int length = 1;
        Node tail = head;

        while (tail.next != null) {
            length++;
            tail = tail.next;
        }

        k = k % length;

        if (k == 0)
            return head;

        tail.next = head;

        Node newLastNode = findNewNode(head, length - k);

        head = newLastNode.next;
        newLastNode.next = null;

        return head;
    }

    private static Node findNewNode(Node head, int pos) {

        int count = 1;

        while (count < pos) {
            head = head.next;
            count++;
        }

        return head;
    }

    public static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        int k = 2;

        head = rotate(head, k);

        System.out.println("Rotated List:");
        printList(head);
    }
}