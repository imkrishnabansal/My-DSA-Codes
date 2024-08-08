//package Tree;
//import java.util.*;
//
//class Node1 {
//    int val;
//    Node1 left;
//    Node1 right;
//
//    // Correct constructor syntax
//    Node1(int val) {
//        this.val = val;
//        left = null;
//        right = null;
//    }
//}
//public class Inorder_Traversal {
//
//    // Static method to perform preorder traversal
//    public static void Inorder(Node1 node) {
//        if (node == null) {
//            return;
//        }
//        Inorder(node.left);
//        System.out.println(node.val);
//        Inorder(node.right);
//    }
//    public static void main(String[] args) {
//        Node1 root = new Node1(1);
//        root.left = new Node1(2);
//        root.right = new Node1(3);
//        root.left.left = new Node1(4);
//        root.left.right = new Node1(5);
//        root.right.left = new Node1(6);
//        root.right.right = new Node1(7);
//        System.out.print("Inorder traversal ");
//       Inorder(root);
//
//
//
//    }
//}
