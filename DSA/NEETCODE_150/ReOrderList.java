package DSA.NEETCODE_150;

import java.util.List;

public class ReOrderList {

    class ListNode{
        ListNode next;
        int val;

      public ListNode() {}

        public ListNode(int val) { this.val = val; }

        public ListNode(ListNode next, int val) {
            this.next = next;
            this.val = val;
        }
    }


    public void reorderList(ListNode head) {
        if(head == null)
            return;

        // middle of the LL
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        // reverse a LL form the middle where slow points
        ListNode previousNode = null;
        ListNode currentNode = slowPointer;
        ListNode tempNode;

        while (currentNode != null){
            tempNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = tempNode;
        }

        // merge
        ListNode first = head;
        ListNode second = previousNode;

        while (second.next != null){
            tempNode = first.next;
            first.next = second;
            first = tempNode;

            tempNode = second.next;
            second.next = first;
            second = tempNode;
        }
    }
}
