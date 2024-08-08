package Tree;
import java.util.*;
import java.util.ArrayList;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val =val;
        this.left = null;
        this.right = null;
    }
}

class Binary_Tree_Level_Order {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        // Set children for node 2
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Set children for node 4
        root.left.left.left = new TreeNode(6);
        root.left.left.right = new TreeNode(7);

        Binary_Tree_Level_Order bt = new Binary_Tree_Level_Order();
        List<List<Integer>> result = bt.levelorder(root);
        System.out.println(result);  // Output: [[1], [2, 3], [4, 5], [6, 7]]
    }

    public List<List<Integer>> levelorder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelsize);
            for(int i =0;i<levelsize;i++){
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;

    }
}
