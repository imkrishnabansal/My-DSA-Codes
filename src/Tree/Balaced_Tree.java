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
//public class Balaced_Tree {
//    public boolean isBalanced(Node root){
//        return dfsHeight(root)!= -1;
//    }
//    int dfsHeight(Node root){
//        if(root==null){
//            return 0;
//        }
//        int leftHeight = dfsHeight(root.left);
//        if(leftHeight==-1) {
//            return -1;
//        }
//            int  rightHeight = dfsHeight(root.right);
//            if(rightHeight==-1){
//                return -1;
//            }
//        if(Math.abs(leftHeight-rightHeight)>1){
//            return -1;
//        }
//        return Math.max(leftHeight,rightHeight);
//    }
//    public static void main(String[] args) {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);
//       Balaced_Tree tree = new Balaced_Tree();
//       boolean isBalanced = tree.isBalanced(root);
//        System.out.println("Is the balanced? ");
//        System.out.println(isBalanced);
//    }
//}
