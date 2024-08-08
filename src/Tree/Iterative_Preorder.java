//package Tree;
//import java.util.*;
//
//class Node { // Corrected class name to match Java conventions
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
//public class Iterative_Preorder {
//    public List<Integer> preorderTraversal(Node root) { // Corrected method name to match Java conventions
//        List<Integer> preorder = new ArrayList<Integer>();
//        if (root == null) {
//            return preorder;
//        }
//
//        Stack<Node> st = new Stack<Node>();
//        st.push(root);
//
//        while (!st.isEmpty()) {
//            root = st.pop();
//            preorder.add(root.val);
//
//            // Push right child first so that the left child is processed first
//            if (root.right != null) {
//                st.push(root.right);
//            }
//            if (root.left != null) {
//                st.push(root.left);
//            }
//        }
//        return preorder;
//    }
//
//    public static void main(String[] args) {
//        // Corrected class name to Node for consistency
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);
//
//        // Create an instance of Iterative_Preorder to call preorderTraversal
//        Iterative_Preorder traversal = new Iterative_Preorder();
//        List<Integer> result = traversal.preorderTraversal(root);
//
//        // Printing the preorder traversal
//        System.out.println("Preorder traversal: " + result);
//    }
//}
