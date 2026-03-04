package DSA.LEARN.LINKEDLIST;

import static DSA.LEARN.LINKEDLIST.ArrayToLL.convertArrayToLL;
import static DSA.LEARN.LINKEDLIST.ArrayToLL.printLL;

public class InsertionAndDeletion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = convertArrayToLL(arr);
        head = insertLast(head, 11);
        printLL(head);
    }

    //delete head
    public static Node deleteHead(Node head){
        if (head == null)
            return head;
        head = head.next;
        return head;
    }

    // delete tail
    public static Node deleteTail(Node head){

        if (head.next == null || head == null)
            return null;

        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;
        return head;
    }


    // delete the element based on position
    public static  Node deletePosition(Node head, int k){
        if (head == null)
            return null;

        // delete head;
        if (k == 1) {
            head = head.next;
            return head;
        }

        int count = 0;
        Node temp = head;
        Node previous = null;

        while (temp != null){
            count++;

            if (count == k){
                previous.next = previous.next.next;
                break;
            }
            previous = temp;
            temp = temp.next;
        }
        return head;
    }


    // delete the value in ll
     public static  Node deleteValue(Node head, int element){
        if (head == null)
            return null;

        // delete head;
        if (head.data == element) {
            head = head.next;
            return head;
        }


        Node temp = head;
        Node previous = null;

        while (temp != null){


            if (temp.data == element){
                previous.next = previous.next.next;
                break;
            }
            previous = temp;
            temp = temp.next;
        }
        return head;
    }



    // insert element on first
    public static Node insertFirst(Node head, int value){
//        Node temp = head;
//        Node newNode = new Node(value);
//
//        newNode.next = temp;
//        head = newNode;
//
//        return head;

        return new Node(value, head);
    }

    // insert element at last
    public static Node insertLast(Node head, int value){
        if (head == null)
            return new Node(value);

        Node newNode = new Node(value);
        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    // insert element at given Position
    public static Node insertPosition(Node head, int value, int position){
        if (head == null){
            if (position == 1)
                return new Node(value);
        }

        if (position == 1){
            Node temp = new Node(value, head);
            return temp;
        }
        return head;
    }
}
