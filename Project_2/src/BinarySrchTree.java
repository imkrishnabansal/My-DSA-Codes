//package Project_2.src;
//
//public class BinarySrchTree {
//    class Node{
//        int data;
//        Node left;
//        Node right;
//        Node(int d){
//            data = d;
//            left =null;
//            right = null;
//        }
//    }
//    static Node CreateBst(Node root,int val){
//        if(root==null){
//            root = new Node(val);
//            return root;
//        }
//        if(root.data>val){
//            root.left = CreateBst(root.right,val);
//        }
//        if(root.data<val){
//            root.left = CreateBst(root.left,val);
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] nodes = {30,40,10,15,3,60};
//        Node root =null;
//        for(int i =0;i<nodes.length;i++){
//            root = CreateBst(root,nodes[i]);
//        }
//    }
//}
