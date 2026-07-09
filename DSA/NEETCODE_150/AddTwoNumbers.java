package DSA.NEETCODE_150;

public class AddTwoNumbers {

    // ListNode Class
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Add Two Numbers
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;

            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }

        return dummy.next;
    }

    // Create Linked List
    static ListNode createList(int[] arr) {

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        for (int num : arr) {
            temp.next = new ListNode(num);
            temp = temp.next;
        }

        return dummy.next;
    }

    // Print Linked List
    static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }

        System.out.println();
    }

    // Main Method
    public static void main(String[] args) {

        AddTwoNumbers obj = new AddTwoNumbers();

        // 342 = 2 -> 4 -> 3
        ListNode l1 = createList(new int[]{2, 4, 3});

        // 465 = 5 -> 6 -> 4
        ListNode l2 = createList(new int[]{5, 6, 4});

        System.out.print("List 1 : ");
        printList(l1);

        System.out.print("List 2 : ");
        printList(l2);

        ListNode result = obj.addTwoNumbers(l1, l2);

        System.out.print("Result : ");
        printList(result);
    }
}