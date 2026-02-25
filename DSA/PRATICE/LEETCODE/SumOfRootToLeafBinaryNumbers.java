package DSA.PRATICE.LEETCODE;

public class SumOfRootToLeafBinaryNumbers {

    public static class TreeNode {
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

    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int current) {
        if (node == null) {
            return 0;
        }

        current = current * 2 + node.val;

        if (node.left == null && node.right == null) {
            return current;
        }

        return dfs(node.left, current) + dfs(node.right, current);
    }

    public static void main(String[] args) {

        /*
                Example Tree:
                       1
                      / \
                     0   1
                    / \   \
                   0   1   1

                Paths:
                100 = 4
                101 = 5
                111 = 7

                Output = 4 + 5 + 7 = 16
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(1);

        SumOfRootToLeafBinaryNumbers obj = new SumOfRootToLeafBinaryNumbers();
        int result = obj.sumRootToLeaf(root);

        System.out.println("Sum of Root to Leaf Binary Numbers: " + result);
    }
}