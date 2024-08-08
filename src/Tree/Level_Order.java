package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Class representing a basic TreeNode structure
class TreeNodes {
    int val;
    TreeNodes left;
    TreeNodes right;

    TreeNodes(int x) {
        val = x;
    }
}

public class Level_Order {
    public static void main(String[] args) {
        // Example tree: 1, 2, 3, 4, 5, 6, 7
        TreeNodes root = new TreeNodes(1);
        root.left = new TreeNodes(2);
        root.right = new TreeNodes(3);
        root.left.left = new TreeNodes(4);
        root.left.right = new TreeNodes(5);
        root.right.left = new TreeNodes(6);
        root.right.right = new TreeNodes(7);

        // Perform level order traversal
        Level_Order lo = new Level_Order();
        List<List<Integer>> result = lo.levelOrder(root);
        System.out.println(result);
    }

    // Method to perform level order traversal
    public List<List<Integer>> levelOrder(TreeNodes root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNodes> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new LinkedList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNodes currentNode = queue.poll();
                currentLevel.add(currentNode.val);

                // Add left child to the queue if it exists
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }

                // Add right child to the queue if it exists
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }

            // Add the current level's list to the final result
            result.add(currentLevel);
        }

        return result;
    }
}
