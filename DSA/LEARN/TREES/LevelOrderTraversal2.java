package DSA.LEARN.TREES;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal2 {
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


     public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

            if (root == null)
                return ans;

         Queue<Node> queue = new LinkedList<>();
         queue.offer(root);

         while (!queue.isEmpty()){
            int size = queue.size();

            ArrayList<Integer> currentLevelList = new ArrayList<>();

             for (int i = 0; i < size; i++) {
               Node currentNode = queue.poll();
                 currentLevelList.add(currentNode.value);

                 if (currentNode.left != null)
                     queue.offer(currentNode.left);

                 if (currentNode.right != null)
                     queue.offer(currentNode.right);
             }


             ans.add(0, currentLevelList);
         }
            return ans;
    }
    }
