package DSA.LEARN.LINKEDLIST;

public class IntersectionOfTwoLinkedLists {


    class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }


 public static int findIntersection(Node firstHead, Node secondHead) {

        if (firstHead == null || secondHead == null)
            return 0;

        Node temp1 = firstHead;
        Node temp2 = secondHead;

        while (temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;

            if(temp1 == temp2)
                return temp1.data;

            if(temp1 == null)
                temp1 = secondHead;

            if(temp2 == null)
                temp2 = firstHead;
        }
        return temp1.data;
    }

    public static void main(String[] args) {

    }


}
