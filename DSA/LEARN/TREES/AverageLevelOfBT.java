package DSA.LEARN.TREES;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevelOfBT {
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

    public List<Double> averageOfLevels(Node root) {
        List<Double> ans = new ArrayList<>();

        Queue<Node> queue = new LinkedList<>();
        if (root == null)
            return ans;

        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            double totalSum = 0;
            for (int i = 0; i < size; i++) {
                Node currentNode = queue.poll();
                totalSum += currentNode.value;

                if (currentNode.left != null)
                    queue.offer(currentNode.left);
                if (currentNode.right != null)
                    queue.offer(currentNode.right);
            }
            double average = totalSum / size;
            ans.add(average);
        }
        return ans;
    }
}
