package DSA.LEETCODE;

// problem url => https://leetcode.com/problems/maximum-product-of-splitted-binary-tree/?envType=daily-question&envId=2026-01-07
// problem name => Maximum Product of Splitted Binary Tree


public class MaximumProductOfSplittedBinaryTree {


    long totalSum = 0;
    long maxProduct = 0;

    static final int MOD = 1000000007;

    public int maxProduct(TreeNode root) {
        totalSum = getTotalSum(root);
        getSubtreeSum(root);
        return (int)  (maxProduct % MOD);
    }

    private long getSubtreeSum(TreeNode node) {
        if (node == null)
            return 0;

        long left = getSubtreeSum(node.left);
        long right = getSubtreeSum(node.right);

        long subtreeSum = left + right + node.val;
        long product = subtreeSum * (totalSum - subtreeSum);
        maxProduct = Math.max(maxProduct, product);
        return subtreeSum;
    }

    private long getTotalSum(TreeNode node) {
        if (node == null)
            return 0;
        return node.val + getTotalSum(node.left) + getTotalSum(node.right);
    }


    class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {

       }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

}


