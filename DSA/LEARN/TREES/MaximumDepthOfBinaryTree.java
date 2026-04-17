package DSA.LEARN.TREES;

public class MaximumDepthOfBinaryTree {
        public class TreeNode {
            int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

            TreeNode(int val) {
            this.val = val;
      }

      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

  }

    int max = 0;
        public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        max = Math.max(leftHeight,rightHeight) + 1;
        return max;
    }
}
