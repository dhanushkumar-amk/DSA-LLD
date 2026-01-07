package DSA.PRATICE.LEETCODE;

// problem statement => Maximum Level Sum of a Binary Tree
// problem url => https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/description/?envType=daily-question&envId=2026-01-06

import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSumOfABinaryTree {
    public static void main(String[] args) {

    }

    public int maxLevelSum(TreeNode root) {
        int ans = 1;
        int maxSum  = 0;
        int level = 1;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            int sum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode currentNode = queue.poll();
                sum += currentNode.val;
                if (currentNode.left != null)
                    queue.add(currentNode.left);

                if (currentNode.right != null)
                    queue.add(currentNode.right);
            }

            if (sum > maxSum){
                maxSum = sum;
                ans = level;
            }
            level++;
        }
        return ans;
    }
}

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
