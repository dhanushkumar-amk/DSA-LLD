package DSA.NEETCODE_150;

public class MergeTwoSortedLists {
    static void main() {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(1);
        ListNode merge = dummyNode;

        while (list1 != null && list2 != null){
            if (list1.data < list2.data) {
                merge.next = list1;
                list1 = list1.next;
            }else{
                merge.next = list2;
                list2 = list2.next;
            }

            merge = merge.next;
        }
        if (merge.next == list1 && list1 == null)
            merge.next = list2;
        else
            merge.next = list1;

        return dummyNode.next;
    }


      class ListNode {
          int data;
         ListNode next;

          ListNode(int data) {
              this.data = data;
              this.next = null;
          }
      }
}
