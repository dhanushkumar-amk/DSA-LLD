//package DSA.LEARN.LINKEDLIST;
//
//public class DetectCycleInLL {
//
//    static class Node {
//        public int data;
//        public Node next;
//
//        Node() {
//            this.data = 0;
//            this.next = null;
//        }
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//
//        Node(int data, Node next) {
//            this.data = data;
//            this.next = next;
//        }
//    }
//
//    public static boolean detectCycle(Node head) {
//        Node slowPointer = head;
//        Node fastPointer = head;
//
//        while (fastPointer != null && fastPointer.next != null) {
//            slowPointer = slowPointer.next;
//            fastPointer = fastPointer.next.next;
//
//            if (slowPointer == fastPointer)
//                return true;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//
//        Node head = new Node(1);
//        Node second = new Node(2);
//        Node third = new Node(3);
//        Node fourth = new Node(4);
//        Node fifth = new Node(5);
//
//        head.next = second;
//        second.next = third;
//        third.next = fourth;
//        fourth.next = fifth;
//
//        fifth.next = third;
//
//        boolean result = detectCycle(head);
//
//        if (result) {
//            System.out.println("Cycle detected in Linked List");
//        } else {
//            System.out.println("No cycle in Linked List");
//        }
//    }
//}