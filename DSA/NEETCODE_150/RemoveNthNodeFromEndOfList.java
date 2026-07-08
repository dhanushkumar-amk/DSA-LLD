package DSA.NEETCODE_150;

public class RemoveNthNodeFromEndOfList {
     static class ListNode{
        ListNode next;
        int val;

      public ListNode() {}

        public ListNode(int val) { this.val = val; }

        public ListNode(ListNode next, int val) {
            this.next = next;
            this.val = val;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode dummyNode = new ListNode(1);
         dummyNode.next = head;


         ListNode frontNode = dummyNode;
         ListNode backNode = dummyNode;

        for (int i = 0; i <= n; i++) {
            frontNode = frontNode.next;
        }


        while (frontNode != null ){
            frontNode = frontNode.next;
            backNode = backNode.next;
        }

        backNode.next = backNode.next.next;
        return dummyNode.next;
    }

   public static void main(String args[]) {

    }
}
