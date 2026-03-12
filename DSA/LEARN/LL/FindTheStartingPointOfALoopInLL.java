package DSA.LEARN.LL;

public class FindTheStartingPointOfALoopInLL {
    class Node{
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }


        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

      public static Node firstNode(Node head) {
        Node fastPointer = head;
        Node slowPointer = head;

        while (fastPointer != null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;

            if (slowPointer == fastPointer){

                slowPointer = head;

                while (slowPointer != fastPointer){
                    slowPointer = slowPointer.next;
                    fastPointer = fastPointer.next;
                }
                return slowPointer;
            }
        }
        return null;
    }

}
