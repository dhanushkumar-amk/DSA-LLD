package DSA.LEETCODE;

public class SearchInABinarySearchTree {


    class TreeNode{
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



     public TreeNode searchBST(TreeNode root, int target) {
        if (root == null)
            return null;



        TreeNode left = searchBST(root.left, target);
        TreeNode right = searchBST(root.right, target);

        if (root.val == target)
            return root;

        if (left != null)
            return left;

        if (right != null)
            return right;

        return null;
    }

}
