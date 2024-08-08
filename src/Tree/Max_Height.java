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
//public class Max_Height {
//    public static int maxDept(Node root){
//        if(root==null){
//            return 0;
//        }
//        int lh  = maxDept(root.left);
//        int rh = maxDept(root.right);
//        return 1+ Math.max(lh,rh);
//    }
//    public static void main(String[] args) {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);
//       int depth = maxDept(root);
//        System.out.println("maximum depth of the tree is :" + depth);
//
//    }
//}
