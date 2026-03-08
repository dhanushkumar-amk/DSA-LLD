package DSA.LEARN.LINKEDLIST;

public class AddOneToTheLL {

    static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node addOne(Node head) {
        int carry = addHelperFunc(head);

        if (carry == 1) {
            Node newNode = new Node(1);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    private static int addHelperFunc(Node temp) {
        if (temp == null)
            return 1;

        int carry = addHelperFunc(temp.next);

        temp.data += carry;

        if (temp.data < 10)
            return 0;

        temp.data = 0;
        return 1;
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
        head.next = new Node(9);
        head.next.next = new Node(9);

        System.out.println("Original List:");
        printList(head);

        head = addOne(head);

        System.out.println("After Adding One:");
        printList(head);
    }
}