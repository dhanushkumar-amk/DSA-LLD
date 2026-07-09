package DSA.NEETCODE_150;

import java.util.HashMap;

public class CopyListWithRandomPointer {

    public static void main(String[] args) {

        CopyListWithRandomPointer solution = new CopyListWithRandomPointer();

        // Create Nodes
        Node n1 = solution.new Node(7);
        Node n2 = solution.new Node(13);
        Node n3 = solution.new Node(11);
        Node n4 = solution.new Node(10);
        Node n5 = solution.new Node(1);

        // Next pointers
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        // Random pointers
        n1.random = null;
        n2.random = n1;
        n3.random = n5;
        n4.random = n3;
        n5.random = n1;

        System.out.println("Original List:");
        solution.printList(n1);

        Node copiedHead = solution.copyRandomList(n1);

        System.out.println("\nCopied List:");
        solution.printList(copiedHead);
    }

    HashMap<Node, Node> visitedNode = new HashMap<>();

    public Node copyRandomList(Node head) {

        if (head == null)
            return null;

        if (visitedNode.containsKey(head))
            return visitedNode.get(head);

        Node node = new Node(head.val);

        visitedNode.put(head, node);

        node.next = copyRandomList(head.next);
        node.random = copyRandomList(head.random);

        return node;
    }

    public void printList(Node head) {

        Node current = head;

        while (current != null) {

            int randomValue;

            if (current.random == null)
                randomValue = -1;
            else
                randomValue = current.random.val;

            System.out.println(
                    "Node Value = " + current.val +
                    " , Random = " + randomValue);

            current = current.next;
        }
    }

    class Node {

        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}