//package Tree;
//import java.util.*;
//
//class Node {
//    int val;
//    Node left;
//    Node right;
//
//    // Correct constructor syntax
//    Node(int val) {
//        this.val = val;
//        left = null;
//        right = null;
//    }
//}
//
//public class PreOrder_traversal {
//
//    // Static method to perform preorder traversal
//    public static void preorder(Node node) {
//        if (node == null) {
//            return;
//        }
//        // Print the node value
//        System.out.print(node.val + " ");
//        // Recur on the left child
//        preorder(node.left);
//        // Recur on the right child
//        preorder(node.right);
//    }
//
//    public static void main(String[] args) {
//        // Creating a binary tree
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);
//
//        // Performing preorder traversal
//        System.out.print("Preorder traversal: ");
//        preorder(root);
//    }
//}
