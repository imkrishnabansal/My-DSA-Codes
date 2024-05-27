package Project_2.src;
import java.util.*;
public class PracLinklist {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void addFirst(int d) {
        Node newnode = new Node(d);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    void dltLast() {
        if (head == null) {
            return;
        }
        Node last = head;
        Node prev = head;
        while (last.next != null) {
            prev = last;
            last = last.next;
        }
        prev.next = null;
    }

    void addLast(int d) {
        Node newnode = new Node(d);
        if (head == null) {
            head = newnode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newnode;
    }

    void search(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node last = head;
        int position = 0;
        while (last != null) {
            position++;
            if (pos == position) {
                System.out.println("Element found " + last.data + " at position " + pos);
                return;
            }
            last = last.next;
        }
        System.out.println("Element not found at position " + pos);
    }

    void even() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        int count = 0;
        while (current != null) {
            if (current.data % 2 == 0) {
                count++;
            }
            current = current.next;
        }
        System.out.println("The count of even elements in this linked list is " + count);
    }

    void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node last = head;
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PracLinklist list = new PracLinklist();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements to add:");
        int count = sc.nextInt();

        System.out.println("Enter the elements:");
        while (count-- > 0) {
            int element = sc.nextInt();
            list.addFirst(element);
        }

        System.out.println("Linked List:");
        list.printList();

        System.out.println("Adding 5 to the beginning of the list:");
        list.addLast(5);
        list.printList();

        sc.close();
    }
}
