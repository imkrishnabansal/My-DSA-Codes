package Tree;
import java.util.Scanner;
public class Binary_Tree {
    private Node root;

    public Binary_Tree() {
        root = null;
    }

    // Node class for the binary tree
    private static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    // Method to populate the tree
    public void populate(Scanner scanner) {
        System.out.println("Enter the value for the root node:");
        int val = scanner.nextInt();
        root = new Node(val);
        populate(scanner, root);
    }
    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter a left child for " + node.val + "? (yes/no)");
        String left = scanner.next();
        if (left.equalsIgnoreCase("yes")) {
            System.out.println("Enter the value of the left child:");
            int leftVal = scanner.nextInt();
            node.left = new Node(leftVal);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter a right child for " + node.val + "? (yes/no)");
        String right = scanner.next();
        if (right.equalsIgnoreCase("yes")) {
            System.out.println("Enter the value of the right child:");
            int rightVal = scanner.nextInt();
            node.right = new Node(rightVal);
            populate(scanner, node.right);
        }
    }
    // Method to display the tree (in-order traversal)
    public void display() {
        display(root);
    }
    private void display(Node node) {
        if (node == null) {
            return;
        }
        display(node.left); // Visit left subtree
        System.out.print(node.val + " "); // Visit node
        display(node.right); // Visit right subtree
    }
    // Main method to test the binary tree
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Binary_Tree tree = new Binary_Tree();
        tree.populate(scanner); // Populate the tree first
        System.out.println("The in-order traversal of the tree is:");
        tree.display(); // Then display the tree
    }
}
