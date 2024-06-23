package Arrays.src.LinkListAssignment;
import java.util.*;
public class OddEven {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node rearrangeOddEven(Node head) {
        if (head == null || head.next == null)
            return head;

        Node oddStart = null, oddEnd = null;
        Node evenStart = null, evenEnd = null;

        Node current = head;

        while (current != null) {
            if (current.data % 2 != 0) { // Odd element
                if (oddStart == null) {
                    oddStart = current;
                    oddEnd = current;
                } else {
                    oddEnd.next = current;
                    oddEnd = oddEnd.next;
                }
            } else { // Even element
                if (evenStart == null) {
                    evenStart = current;
                    evenEnd = current;
                } else {
                    evenEnd.next = current;
                    evenEnd = evenEnd.next;
                }
            }
            current = current.next;
        }

        // Concatenate odd and even lists
        if (oddStart != null) {
            head = oddStart;
            oddEnd.next = evenStart;
        } else {
            head = evenStart;
        }

        if (evenEnd != null) {
            evenEnd.next = null;
        }

        return head;
    }

    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        Node head = null;
        Node tail = null;

        for (int i = 0; i < N; i++) {
            int data = scanner.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        head = rearrangeOddEven(head);
        printList(head);

        scanner.close();
    }
}