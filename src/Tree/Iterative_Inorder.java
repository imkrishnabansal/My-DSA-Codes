//package Tree;
//import java.util.*;
//class Node {
//    int val;
//    Node left;
//    Node right;
//
//    Node(int val){
//        this.val =val;
//        left = null;
//        right =null;
//    }
//}
//public class Iterative_Inorder {
//    public List<Integer> Inordertraversal(Node root) {
//        List<Integer> inorder = new ArrayList<Integer>();
//        Stack<Node> stack = new Stack<Node>();
//        Node node = root;
//        while (true) {
//            if (node != null) {
//                stack.push(node);
//                node = node.left;
//            } else {
//                if (stack.isEmpty()) {
//                    break;
//                }
//                node = stack.pop();
//                inorder.add(node.val);
//                node = node.right;
//            }
//        }
//        return inorder;
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
//        Iterative_Inorder traversal = new Iterative_Inorder();
//        List<Integer> result = traversal.Inordertraversal(root);
//        System.out.println(" iterative Inorder traversal  " + result);
//    }
//
//}
