package DSA.LEARN.LINKEDLIST;



public class DLL {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
          DNode head = convertArrayToDLL(arr);
//          head = deleteKthElement(head, 5);
        deleteNode(head.next);
          printDLL(head);
    }

    // print
    public static void printDLL(DNode head){
        while (head != null){
            System.out.print(head.value + " ");
            head = head.next;
        }
    }

    // convert array to Doubly Linked list
   public static DNode convertArrayToDLL(int[] arr){
        DNode head = new DNode(arr[0]);
        DNode previous  = head;

       for (int i = 1; i < arr.length; i++) {
           DNode newNode = new DNode(arr[i], previous,null);
           previous.next = newNode;
           previous = newNode;
       }
       return head;
   }


   // delete Head
    public static DNode deleteHead(DNode head){
        if (head == null || head.next == null)
            return null;

        DNode previous = head;
        head = head.next;
        head.prev = null;
        previous.next = null;

        return head;
    }

    // delete tail
    public static DNode deleteTail(DNode head){
         if (head == null || head.next == null)
            return null;

        DNode temp = head;

        while (temp.next.next != null){
            temp = temp.next;
        }

        temp.next.prev = null;
        temp.next = null;
        return head;
    }

    // delete  the kth element
    public static DNode deleteKthElement(DNode head, int k){
        if (head == null)
            return null;

        int count = 0;
        DNode temp = head;

        while (temp != null){
            count++;
            if (count == k)
                break;
            temp = temp.next;
        }

        DNode previous = temp.prev;
        DNode front = temp.next;

        if (previous == null && front == null)
            return null;
        else if(previous == null)
            return deleteHead(head);
        else if (front == null)
            return deleteTail(head);

        previous.next = front;
        front.prev = previous;

        temp.next = null;
        temp.prev = null;

        return head;
    }

    // delete the node of the element
    public static void deleteNode(DNode temp){
        DNode previous = temp.prev;
        DNode front = temp.next;

        if (front == null){
            previous.next = null;
            temp.prev = null;
            return;
        }

        previous.next = front;
        front.prev = previous;

        temp.next = null;
        temp.prev = null;
    }
}

