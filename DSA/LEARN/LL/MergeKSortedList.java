package DSA.LEARN.LL;

import java.util.PriorityQueue;

public class MergeKSortedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a, b) -> a.val - b.val
        );

        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (!pq.isEmpty()) {
            ListNode smallest = pq.poll();
            tail.next = smallest;
            tail = tail.next;

            if (smallest.next != null) {
                pq.add(smallest.next);
            }
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        MergeKSortedList obj = new MergeKSortedList();

        ListNode l1 = new ListNode(1,
                        new ListNode(4,
                        new ListNode(5)));

        ListNode l2 = new ListNode(1,
                        new ListNode(3,
                        new ListNode(4)));

        ListNode l3 = new ListNode(2,
                        new ListNode(6));

        ListNode[] lists = {l1, l2, l3};

        ListNode result = obj.mergeKLists(lists);

        printList(result);
    }
}