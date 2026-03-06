package DSA.LEARN.LINKEDLIST;

public class AddTwoNumbersINLL {

    class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}


    public Node addTwoLists(Node head1, Node head2) {

        Node dummyNode = new Node(-1);

        Node current = dummyNode;
        Node temp1 = head1;
        Node temp2 = head2;

        int curry = 0;

        while (temp1 != null || temp2 != null){
            int sum = curry;

            if (temp1 != null)
                sum += temp1.data;

            if (temp2 != null)
                sum += temp2.data;

            Node newNode = new Node(sum % 10);
            curry = sum / 10;

            current.next = newNode;
            current = current.next;

            if (temp1 != null)
                temp1 = temp1.next;

            if (temp2 != null)
                temp2 = temp2.next;
        }

        if (curry != 0){
            Node newNode = new Node(curry);
            current.next = newNode;
        }

        return dummyNode.next;

    }

}
