//public class linklinsts {
//    Node head;
//    class Node {
//        int data;
//        Node next;
//
//        Node(int d) {
//            data = d;
//            next = null;
//        }
//    }
//    void addFirst(int d) {
//        Node newNode = new Node(d);
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//        newNode.next = head;
//        head = newNode;
//    }
//    void addLast(int d){
//        Node newNode = new Node(d);
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//        Node last = head;
//        while(last.next!=null){
//            last = last.next;
//        }
//        last.next = newNode;
//    }
//    void delFirst(){
//        if (head == null) {
//            System.out.println("list is empty");
//            return;
//        }
//        head = head.next;
//    }
//    void delLast(){
//        if (head == null) {
//            System.out.println("list is empty");
//            return;
//        }
//        Node last = head;
//        Node prev = head;
//        while(last.next!=null){
//            prev = last;
//           last =  last.next;
//        }
//        prev.next = null;
//    }
//    void search(int pos) {
//        if (head == null) {
//            System.out.println("list is empty");
//            return;
//        }
//        Node last = head;
//        int position = 0;
//        while (last.next != null) {
//            last = last.next;
//            position++;
//            if (position == pos) {
//                System.out.println();
//                System.out.println("Element Found at Position " + pos + " which is " + last.data);
//                return;
//            }
//        }
//    }
//
//    void printList(){
//        if(head==null){
//            System.out.println("list is empty");
//            return;
//        }
//        Node last = head;
//        while(last!=null){
//            System.out.println(last.data + " ");
//            last = last.next;
//        }
//    }
//
//    public static void main(String[] args) {
//        linklinsts list = new linklinsts();
//        list.addFirst(5);
//        list.addFirst(7);
//        list.addFirst(8);
//        list.addFirst(9);
//        list.addFirst(0);
////        list.printList();
//        list.addFirst(1);
////        list.printList();
//        list.addLast(7);
////        list.printList();
//        list.delFirst();
//        list.delLast();
//        list.search(7);
//        list.printList();
//
//    }
//}
//
//
//
