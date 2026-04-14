package DSA.LEARN.TREES;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ZigZagTraversal {
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

     ArrayList<ArrayList<Integer>> zigZagTraversal(Node root) {
         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

         if(root == null)
             return ans;

         Queue<Node> queue = new LinkedList<>();
         queue.offer(root);

         int level = 0;

         while(!queue.isEmpty()){
             int size = queue.size();

            ArrayList<Integer> list = new ArrayList<>();

             for (int i = 0; i < size; i++) {
               Node currentElement = queue.poll();

               if (level % 2 == 0)
                   list.add(currentElement.data);
               else
                   list.add(0, currentElement.data);

               if (currentElement.left != null)
                   queue.offer(currentElement.left);

               if (currentElement.right != null)
                   queue.offer(currentElement.right);

             }
             ans.add(list);
             level++;
         }
         return ans;
    }
}
