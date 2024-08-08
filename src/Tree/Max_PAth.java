package Tree;
import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
public class Max_PAth {
    public  int path(Node node){
        int maxVal[]  = new int[1];
       maxVal[0] = Integer.MIN_VALUE;
       maximumPathDown(node,maxVal);
       return maxVal[0];

    }
    private int maximumPathDown(Node node,int maxVal[]) {
        if (node == null) {
            return 0;
        }
        int left = Math.max(0, maximumPathDown(node.left, maxVal));
        int right = Math.max(0, maximumPathDown(node.right, maxVal));
        maxVal[0] = Math.max(maxVal[0], left + right + node.val);
        return Math.max(left,right) + node.val;
    }
        public static void main(String[] args) {
            Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(70);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

       Max_PAth tree = new Max_PAth();
        int path = tree.path(root);
        System.out.println("max_path of sum is : " + path);
    }
}
//time complexity is O(n)
