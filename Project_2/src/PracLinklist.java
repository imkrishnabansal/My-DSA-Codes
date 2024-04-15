package Project_2.src;
import java.util.*;
public class PracLinklist {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next =null;
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
            Node last =head;
            Node prev =head;
            while(last.next!=null){
                prev = last;
                last=last.next;
            }
            prev.next =null;
    }
    void addLast(int d){
        Node newnode = new Node(d);
        if(head==null){
            head =newnode;
            return;
        }
        Node last =head;
        while(last.next!=null){
            last=last.next;
        }
        last.next =newnode;
    }
    void search(int pos){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node last = head;
        int positon =0;
        while(last.next!=null){
            positon++;
            if(pos==positon){
                System.out.println("element found " + pos + " at position " + last.data);
                return;
            }
        }
    }
    void even(){
        if(head==null){
            return;
        }
        Node last =head;
        int count =0;
        while(last.next!=null) {
            if(last.data%2==0){
                count++;
            }
            last = last.next;
        }
        System.out.println("the count of even elements in this linked list is "+count);
    }
    void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node last = head;
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.next;
        }
    }
    public static void main(String[] args) {
        PracLinklist list = new PracLinklist();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.printList();
        System.out.println();
        list.dltLast();
        list.printList();
        System.out.println();
        list.addLast(9);
        list.printList();
        System.out.println();
        list.search(3);
//        list.printList();
        System.out.println();
        list.even();



    }
}
