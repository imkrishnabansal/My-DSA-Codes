package Tree;

import java.util.*;

public class Bst {
    // Inner Node class
    public class Node {
        private int val;
        private int height;
        private Node left;
        private Node right;

        // Constructor for Node
        public Node(int val) {
            this.val = val;
            this.height = 0; // Initial height
        }

        // Getter for value
        public int getVal() {
            return val;
        }
    }

    // Root of the BST
    private Node root;

    // Constructor for Bst
    public Bst() {
        this.root = null;
    }

    // Get the height of a node
    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    // Check if the tree is empty
    public boolean isEmpty() {
        return root == null;
    }

    // Display the tree
    public void display() {
        display(root, "Root node: ");
    }

    // Helper method to display the tree
    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.getVal());
        display(node.left, "Left child of " + node.getVal() + ": ");
        display(node.right, "Right child of " + node.getVal() + ": ");
    }

    // Method to insert a value into the BST
    public void insert(int val) {
        root = insert(root, val);
    }

    // Recursive insert helper method
    private Node insert(Node node, int val) {
        if (node == null) {
            node = new Node(val);
            return node;
        }
        if (val < node.getVal()) {
            node.left = insert(node.left, val);
        } else if (val > node.getVal()) {
            node.right = insert(node.right, val);
        }
        node.height = 1 + Math.max(height(node.left), height(node.right));
        return node;
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1&&balanced(node.left)&&balanced(node.right);
    }
    public void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.val);
        preorder(node.left);
        preorder(node.right);
    }
    public static void main(String[] args) {
        Bst bst = new Bst();
        Bst pre = new Bst();

//         Insert values into the BST
        bst.insert(20);
        bst.insert(10);
        bst.insert(15);
        bst.insert(13);
        bst.insert(12);
        bst.preorder(bst.root);
        // Display the BST structure
//        bst.display();



    }
}
