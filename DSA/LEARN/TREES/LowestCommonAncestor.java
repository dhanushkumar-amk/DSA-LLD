package DSA.LEARN.TREES;

public class LowestCommonAncestor {
 public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

      TreeNode(int x) {
          val = x;
      }
  }

      public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
         return null;

        return root;
    }

}
