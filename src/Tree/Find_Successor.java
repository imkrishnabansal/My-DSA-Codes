//package Tree;
//
//import java.util.*;
//
//class TreeNode {  // Corrected class name to TreeNode for consistency
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int val) {
//        this.val = val;
//        this.left = null;
//        this.right = null;
//    }
//}
//class Find_Successor {
//    public static void main(String[] args) {
//        // Constructing the binary tree
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//
//        // Set children for node 2
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//
//        // Set children for node 4
//        root.left.left.left = new TreeNode(6);
//        root.left.left.right = new TreeNode(7);
//
//        Find_Successor bt = new Find_Successor();
//
//        // Find successor for a given key
//        TreeNode successor = bt.findSuccessor(root, 3);
//        if (successor != null) {
//            System.out.println("Successor of 3 is: " + successor.val);
//        } else {
//            System.out.println("No successor found.");
//        }
//    }
//
//    // Method to find the successor of a node in level order traversal
//    public TreeNode findSuccessor(TreeNode root, int key) {
//        if (root == null) {
//            return null;  // If the root is null, return null
//        }
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);  // Start with the root node
//
//        while (!queue.isEmpty()) {
//            TreeNode currentNode = queue.poll();  // Get the next node in the queue
//
//            // Enqueue the left and right children if they exist
//            if (currentNode.left != null) {
//                queue.offer(currentNode.left);
//            }
//            if (currentNode.right != null) {
//                queue.offer(currentNode.right);
//            }
//
//            // Check if this node is the one we are looking for
//            if (currentNode.val == key) {
//                break;  // Exit the loop if the key is found
//            }
//        }
//
//        // Return the next node in the queue, or null if the queue is empty
//        return queue.peek();
//    }
//}