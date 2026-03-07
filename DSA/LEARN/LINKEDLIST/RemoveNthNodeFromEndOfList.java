package DSA.LEARN.LINKEDLIST;

public class RemoveNthNodeFromEndOfList {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Node removeKthFromEnd(Node head, int k) {

        Node fast = head;
        Node slow = head;

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        if (fast == null)
            return head.next;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

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

        head = removeKthFromEnd(head, k);

        System.out.println("After Removing " + k + "th Node From End:");
        printList(head);
    }
}