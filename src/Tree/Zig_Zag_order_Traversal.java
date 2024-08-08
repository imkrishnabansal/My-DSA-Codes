//package Tree;
//import java.util.*;
//class TNode{
//    int val;
//    TNode left;
//    TNode right;
//
//    TNode(int val){
//        this.val =val;
//        left =null;
//        right = null;
//    }
//}
//public class Zig_Zag_order_Traversal {
//    public static void main(String[] args) {
//        TNode root = new TNode(1);
//        root.left = new TNode(2);
//        root.right = new TNode(3);
//        root.left.left = new TNode(4);
//        root.left.right = new TNode(5);
//        root.right.left = new TNode(6);
//        root.right.right = new TNode(7);
//        Zig_Zag_order_Traversal zig_zag = new Zig_Zag_order_Traversal();
//        List<List<Integer>> result = Zig_Zag_order_Traversal.levelorder(root);
//        System.out.println(result);  // Output: [[1], [2, 3], [4, 5], [6, 7]]
//    }
//
//    public List<List<Integer>> levelorder(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//        if (root == null) {
//            return result;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            int levelsize = queue.size();
//            List<Integer> currentLevel = new ArrayList<>(levelsize);
//            for (int i = 0; i < levelsize; i++) {
//                TreeNode currentNode = queue.poll();
//                currentLevel.add(currentNode.val);
//                if (currentNode.left != null) {
//                    queue.offer(currentNode.left);
//                }
//                if (currentNode.right != null) {
//                    queue.offer(currentNode.right);
//                }
//            }
//            result.add(currentLevel);
//        }
//        return result;
//    }
//}
