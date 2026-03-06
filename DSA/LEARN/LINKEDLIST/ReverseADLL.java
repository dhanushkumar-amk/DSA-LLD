package DSA.LEARN.LINKEDLIST;

public class ReverseADLL {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node reverse(Node head) {

        if (head == null || head.next == null)
            return head;

        Node previous = null;
        Node current = head;

        while (current != null) {
            previous = current.prev;
            current.prev = current.next;
            current.next = previous;
            current = current.prev;
        }

        return previous.prev;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        head.next = n2;
        n2.prev = head;

        n2.next = n3;
        n3.prev = n2;

        n3.next = n4;
        n4.prev = n3;

        Node newHead = reverse(head);

        print(newHead);
    }
}