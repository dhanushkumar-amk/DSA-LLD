package DSA.LEARN.LL;

public class SortLL {

    static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node sortLL(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node middle = findMiddle(head);
        Node rightHead = middle.next;
        middle.next = null;

        Node left = sortLL(head);
        Node right = sortLL(rightHead);

        return merge(left, right);
    }


    // fast and slow pointer
    public static Node findMiddle(Node head) {

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


// merge function
    public static Node merge(Node l1, Node l2) {

        Node dummy = new Node(-1);
        Node temp = dummy;

        while (l1 != null && l2 != null) {

            if (l1.data <= l2.data) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }

            temp = temp.next;
        }

        if (l1 != null) {
            temp.next = l1;
        }

        if (l2 != null) {
            temp.next = l2;
        }
        return dummy.next;
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

        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        System.out.println("Original List:");
        printList(head);

        head = sortLL(head);

        System.out.println("Sorted List:");
        printList(head);
    }
}