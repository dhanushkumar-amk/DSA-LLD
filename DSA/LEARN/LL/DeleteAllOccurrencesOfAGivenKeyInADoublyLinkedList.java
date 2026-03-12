package DSA.LEARN.LL;

public class DeleteAllOccurrencesOfAGivenKeyInADoublyLinkedList {

    static class Node {
        public int data;
        public Node next;
        public Node prev;

        Node() {
            this.data = 0;
            this.next = null;
            this.prev = null;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public static Node deleteAllOccurrences(Node head, int k) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == k) {

                if (temp == head) {
                    head = temp.next;
                    if (head != null)
                        head.prev = null;
                } else {
                    Node previousNode = temp.prev;
                    Node nextNode = temp.next;

                    if (previousNode != null)
                        previousNode.next = nextNode;

                    if (nextNode != null)
                        nextNode.prev = previousNode;
                }
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
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(2);
        Node fifth = new Node(4);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        fourth.next = fifth;
        fifth.prev = fourth;

        System.out.println("Original List:");
        printList(head);

        int key = 2;
        head = deleteAllOccurrences(head, key);

        System.out.println("After deleting " + key + ":");
        printList(head);
    }
}