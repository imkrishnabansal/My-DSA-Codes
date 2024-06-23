import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int d) {
            data = d;
            left = null;
            right = null;
        }
    }

    static class Tree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = buildTree(nodes);
            newnode.right = buildTree(nodes);
            return newnode;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static Node findParent(Node root, int val) {
        if (root == null || (root.left != null && root.left.data == val) || (root.right != null && root.right.data == val)) {
            return root;
        }
        Node leftParent = findParent(root.left, val);
        if (leftParent != null) {
            return leftParent;
        }
        return findParent(root.right, val);
    }
    static void printParent(Node root) {
        if (root == null) {
            return;
        }
        if (root.left != null || root.right != null) {
            System.out.print(root.data + " ");
            printParent(root.left);
            printParent(root.right);
        }
    }
        static void printSiblings(Node root){
            if (root == null) {
                return;
            }
            if(root.left!=null && root.right!=null){
                System.out.print(root.data+" ");
                printSiblings(root.left);
                printSiblings(root.right);
            }
    }
    static void printLeaf(Node root){
        if (root == null) {
            return;
        }
        if(root.left==null&&root.right==null){
            System.out.print(root.data+" ");
            printLeaf(root.left);
            printLeaf(root.right);
        }
    }
    static int count(Node root){
        if (root == null) {
            return 0;
        }
        int l = count(root.left);
        int r = count(root.right);
        return (l+r+1);
    }

    public static void LevelOrder(Node root){
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currnode = q.remove();
            if(currnode==null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            }
                else{
                    System.out.print(currnode.data+" ");
                    if(currnode.left!=null){
                        q.add(currnode.left);
                    }
                    if(currnode.right!=null){
                        q.add(currnode.right);

                }
            }
        }

    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Tree t = new Tree();
        Node root = Tree.buildTree(nodes);
        System.out.println();
        System.out.println("preorder");
        preorder(root);
        System.out.println();
        System.out.println("Inorder");
        Inorder(root);
        System.out.println();
        System.out.println("postorder");
        postOrder(root);
        System.out.println();
        int val = 6; // Example value for which to find the parent node
        System.out.println("Parent of " + val + ": " + findParent(root, val).data);
        LevelOrder(root);
        System.out.println();
        System.out.println("printparent");
        printParent(root);
        System.out.println();
        System.out.println("printSiblings");
        printSiblings(root);
        System.out.println();

    }
}