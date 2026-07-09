package DSA.NEETCODE_150;

public class RemoveNthNodeFromEndOfList {

    class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Dummy node
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode frontNode = dummyNode;
        ListNode backNode = dummyNode;

        // Move front pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            frontNode = frontNode.next;
        }

        // Move both pointers
        while (frontNode != null) {
            frontNode = frontNode.next;
            backNode = backNode.next;
        }

        // Remove nth node from end
        backNode.next = backNode.next.next;

        return dummyNode.next;
    }

    // Print Linked List
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        RemoveNthNodeFromEndOfList obj = new RemoveNthNodeFromEndOfList();

        // Create Linked List: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(3);
        head.next.next.next = obj.new ListNode(4);
        head.next.next.next.next = obj.new ListNode(5);

        System.out.println("Original List:");
        obj.printList(head);

        head = obj.removeNthFromEnd(head, 2);

        System.out.println("After Removing 2nd Node From End:");
        obj.printList(head);
    }
}