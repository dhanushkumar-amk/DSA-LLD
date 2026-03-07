package DSA.LEARN.LINKEDLIST;

public class Sort0s1s2s {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node sortList(Node head) {

        if (head == null || head.next == null)
            return head;

        Node zeroD = new Node(-1);
        Node oneD = new Node(-1);
        Node twoD = new Node(-1);

        Node zero = zeroD;
        Node one = oneD;
        Node two = twoD;

        Node curr = head;

        while (curr != null) {

            if (curr.data == 0) {
                zero.next = curr;
                zero = zero.next;
            }
            else if (curr.data == 1) {
                one.next = curr;
                one = one.next;
            }
            else {
                two.next = curr;
                two = two.next;
            }

            curr = curr.next;
        }

        zero.next = (oneD.next != null) ? oneD.next : twoD.next;
        one.next = twoD.next;
        two.next = null;

        head = zeroD.next;

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
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(0);

        System.out.println("Linked List before Sorting:");
        printList(head);

        head = sortList(head);

        System.out.println("Linked List after Sorting:");
        printList(head);
    }
}