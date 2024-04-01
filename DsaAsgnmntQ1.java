import java.util.Stack;

public class DsaAsgnmntQ1 {
    Node top;

    class Node {
        int marks;
        String name;
        Node next;

        Node(int m, String n) {
            marks = m;
            name = n;
            next = null;
        }
    }

    void push(int m, String n) {
        Node newNode = new Node(m, n);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }
        void pop(){
            if(top==null){
                System.out.println("Stack is underflow");
            }
            top = top.next;
    }
    void DisplayTopThree() {
        if (top == null) {
            System.out.println("The Stack Is Empty, Can't Display Top Three Students");
            return;
        }
        Node current = top;
        do {
            Node temp = current.next;
            while (temp != null) {
                if (temp.marks > current.marks) {
                    int marksTemp = current.marks;
                    String nameTemp = current.name;
                    current.marks = temp.marks;
                    current.name = temp.name;
                    temp.marks = marksTemp;
                    temp.name = nameTemp;
                }
                temp = temp.next;
            }
            current = current.next;
        } while (current != null);

        System.out.println("Top 3 Positions:");
        int count = 0;
        Node iterator = top;
        while (count < 3 && iterator != null) {
            System.out.println("Student Name: " + iterator.name + ", Marks:" + iterator.marks);
            iterator = iterator.next;
            count++;
        }
    }

    void printList() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node current = top;
        while (current != null) {
            System.out.print(current.marks + " " + current.name + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        DsaAsgnmntQ1 list = new DsaAsgnmntQ1();
        list.push(95, "Arjun");
        list.push(89, "Krishi");
        list.push(78, "Sneha");
        list.push(87, "Aditya");
        list.pop();
        list.DisplayTopThree();
        System.out.println("The marks of the students is :");
        list.printList();
    }
}