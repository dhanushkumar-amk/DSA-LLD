package DSA.LEARN.LL;

public class RemoveDuplicatesDLL {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node removeDuplicates(Node head) {

        Node temp = head;

        while (temp != null && temp.next != null) {

            Node nextNode = temp.next;

            while (nextNode != null && nextNode.data == temp.data) {
                nextNode = nextNode.next;
            }

            temp.next = nextNode;

            if (nextNode != null) {
                nextNode.prev = temp;
            }

            temp = temp.next;
        }

        return head;
    }

    public static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        Node n2 = new Node(1);
        Node n3 = new Node(2);
        Node n4 = new Node(2);
        Node n5 = new Node(3);
        Node n6 = new Node(3);

        head.next = n2;
        n2.prev = head;

        n2.next = n3;
        n3.prev = n2;

        n3.next = n4;
        n4.prev = n3;

        n4.next = n5;
        n5.prev = n4;

        n5.next = n6;
        n6.prev = n5;

        System.out.println("Original DLL:");
        printList(head);

        head = removeDuplicates(head);

        System.out.println("After removing duplicates:");
        printList(head);
    }
}