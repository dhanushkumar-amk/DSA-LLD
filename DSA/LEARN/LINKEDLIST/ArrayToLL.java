//package DSA.LEARN.LINKEDLIST;
//
//public class ArrayToLL {
//
//
//    class Node{
//        int data;
//        Node next;
//
//        public Node(int data, DSA.LEARN.LINKEDLIST.ArrayToLL.Node next) {
//            this.data = data;
//            this.next = next;
//        }
//    }
//
//    public static void Main(String[] args) {
//        int[] arr = {1,2,4,6};
//        Node head = convertArrayToLL(arr);
//
//        int length = lengthOfLL(head);
//        System.out.println(length);
//
//        printLL(head);
//    }
//
//    // length
//    public static int lengthOfLL(Node head){
//        int count = 0;
//        Node temp = head;
//        while (temp != null){
//            temp = temp.next;
//            count++;
//        }
//        return count;
//    }
//
//    // convert array to LL
//    public static Node convertArrayToLL(int[] arr){
//        Node head = new Node(arr[0]);
//
//        Node mover = head;
//
//        for (int i = 1; i < arr.length  ; i++) {
//            Node temp = new Node(arr[i]);
//            mover.next = temp;
//            mover = temp;
//        }
//        return head;
//    }
//
//
////    search in LL
//    public static boolean search(Node head, int target){
//        Node temp = head;
//        while (temp != null){
//            if (temp.data == target)
//                return true;
//
//            temp = temp.next;
//        }
//        return false;
//    }
//
//
//    // print
//    public static void printLL(Node head){
//        Node temp = head;
//        while (temp != null){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//    }
//}
//
