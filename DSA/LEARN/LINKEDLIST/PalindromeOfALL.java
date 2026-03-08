package DSA.LEARN.LINKEDLIST;

public class PalindromeOfALL {

    class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public static boolean isPalindrome(Node head) {

        if(head == null || head.next == null)
            return true;

        Node slowPointer = head;
        Node fastPointer = head;

        while (fastPointer.next != null && fastPointer.next.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        Node newHead = reverseList(slowPointer.next);

        Node first = head;
        Node second = newHead;

        while (second != null){
            if (first.data != second.data){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
}


 public static Node reverseList(Node head) {
        Node temp = head;
        Node previous = null;

        while (temp != null) {
           Node front = temp.next;
            temp.next = previous;
            previous = temp;
            temp = front;
        }

        return previous;
    }


    public static void main(String[] args) {

    }
}
