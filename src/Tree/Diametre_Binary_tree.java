//package Tree;
//
//import java.util.*;
//
//class Node {
//    int val;
//    Node left;
//    Node right;
//
//    Node(int val) {
//        this.val = val;
//        left = null;
//        right = null;
//    }
//}
//
//class Diameter_Binary_tree {
//    public int diameter(Node root) {
//        int[] d = new int[1];  // Stores the final diameter
//        height(root, d);
//        return d[0];
//    }
//
//    private int height(Node node, int[] d) {
//        if (node == null) {
//            return 0;
//        }
//        int lh = height(node.left, d);  // Left subtree height
//        int rh = height(node.right, d);  // Right subtree height
//
//        // Update the diameter if the current node's diameter is larger
//        d[0] = Math.max(d[0], lh + rh);
//
//        // Return the height of the tree rooted at the current node
//        return 1 + Math.max(lh, rh);
//    }
//
//    public static void main(String[] args) {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);
//
//       Diameter_Binary_tree tree = new Diameter_Binary_tree();
//        int diameter = tree.diameter(root);
//        System.out.println("Diameter of the tree is: " + diameter);
//    }
//}
