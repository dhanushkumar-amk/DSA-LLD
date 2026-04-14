package DSA.LEARN.TREES;

import java.util.LinkedList;
import java.util.Queue;

public class LeveOrderSuccessorOfANode {
    public class Node {
        int value;
        int height;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.height = 0;
        }

        public int getValue() {
            return value;
        }
    }


    private static Node successor(Node root, int target){
        if (root == null)
            return null;

        Queue<Node> queue = new LinkedList<>();

        while (!queue.isEmpty()){
                Node currentElement = queue.poll();

                if (currentElement.left != null)
                    queue.add(currentElement.left);

                if (currentElement.right != null)
                    queue.add(currentElement.right);

                if (currentElement.value == target){
                    return queue.peek();
                }
            }
        return null;
    }

    public static void main(String[] args) {

    }
}
