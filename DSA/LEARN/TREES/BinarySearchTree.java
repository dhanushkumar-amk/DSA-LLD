package DSA.LEARN.TREES;

public class BinarySearchTree {

    public class Node {
        private int value;
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

    private Node root;

    public BinarySearchTree() {
    }

    public int height(Node node) {
        if (node == null) return -1;
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    // 🔥 INSERT FUNCTION (CREATE TREE)
    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        }

        // update height
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    // 🔍 SEARCH
    public boolean contains(int value) {
        return contains(value, root);
    }

    private boolean contains(int value, Node node) {
        if (node == null) return false;

        if (value < node.value) {
            return contains(value, node.left);
        } else if (value > node.value) {
            return contains(value, node.right);
        }

        return true;
    }

    // 🌳 DISPLAY
    public void display() {
        display(root, "Root node: ");
    }

    private void display(Node node, String details) {
        if (node == null) return;

        System.out.println(details + node.getValue());
        display(node.left, "Left child of " + node.getValue() + ": ");
        display(node.right, "Right child of " + node.getValue() + ": ");
    }

    // 🔁 INORDER (sorted output)
    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node node) {
        if (node == null) return;

        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // 🔁 PREORDER
    public void preOrder() {
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node node) {
        if (node == null) return;

        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // 🔁 POSTORDER
    public void postOrder() {
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node node) {
        if (node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    // 🚀 MAIN METHOD
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        int[] values = {10, 5, 15, 3, 7, 12, 18};

        for (int val : values) {
            bst.insert(val);
        }

        System.out.println("Tree Structure:");
        bst.display();

        System.out.println("\nInorder Traversal (Sorted):");
        bst.inOrder();

        System.out.println("Preorder Traversal:");
        bst.preOrder();

        System.out.println("Postorder Traversal:");
        bst.postOrder();

        System.out.println("\nSearch 7: " + bst.contains(7));
        System.out.println("Search 20: " + bst.contains(20));
    }
}