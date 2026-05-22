

class SwapNodesInPairs {

  public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  
    public ListNode swapPairs(ListNode head) {

      // Base case: If the list is empty or has only one node, return the head as is
       if (head == null || head.next == null)
           return head;
      
        // create a dummy node
      ListNode dummy = new ListNode(0);
      dummy.next = head;

      // create a listnode to traverse the list
      ListNode current = dummy;

      while (current.next != null && current.next.next != null){
          ListNode first = current.next;
          ListNode second = current.next.next;

        first.next = second.next;
        second.next = first;

        // Now move the current pointer to the first node of the next pair
        current.next = second;
        current = first;
      }


      return dummy.next;
    }
}