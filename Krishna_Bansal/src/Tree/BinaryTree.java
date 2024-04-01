package Krishna_Bansal.src.Tree;

public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            data = d;
            left =null;
            right =null;
        }
    }
    static class Tree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnode = new Node (nodes[idx]);
            newnode.left = buildTree(nodes);
            newnode.right = buildTree(nodes);
            return newnode;
        }
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Tree t = new Tree();
        Node root = Tree.buildTree(nodes);
        System.out.println(root.data);
//        preorder(root);
//        Inorder(root);
        postOrder(root);

    }
}
//time complexity is O(n)
