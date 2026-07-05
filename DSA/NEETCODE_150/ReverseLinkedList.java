package DSA.NEETCODE_150;



public class ReverseLinkedList {
      class ListNode {
          int data;
          ListNode next;

          ListNode(int data) {
              this.data = data;
              this.next = null;
          }
      }

       public ListNode reverseList(ListNode head) {
        ListNode currentNode = head;
        ListNode previousNode = null;

           while (currentNode != null) {
               ListNode frontNode = currentNode.next;
               currentNode.next = previousNode;
               previousNode = currentNode;
               currentNode = frontNode;
           }
           return previousNode;
    }
}
