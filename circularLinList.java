//public class circularLinList {
//    Node head;
//
//    class Node {
//        int data;
//        Node next;
//
//        Node(int d) {
//            data = d;
//            next = null;
//        }
//    }
//
//        void addFirst(int d) {
//            Node newnode = new Node(d);
//            if (head == null) {
//                head = newnode;
//                head.next = head;
//                return;
//            }
//            Node last = head;
//            while (last.next != null) {
//                last = last.next;
//            }
//            newnode.next = head;
//            last.next = newnode;
//            head = newnode;
//        }

        //    void addLast(int d) {
//        Node newnode = new Node(d);
//        if (head == null) {
//            head = newnode;
//            return;
//        }
//        Node last = head;
//        while (last.next != null) {
//            last = last.next;
//        }
//        last.next = newnode;
//    }
//    void delFirst(int d){
//        Node newnode = new Node(d);
//        if(head==null){
//            head = newnode;
//            return;
//        }
//      head = head.next;
//        }
//        void delLast(int d) {
//            Node newnode = new Node(d);
//            if (head == null) {
//                head = newnode;
//                return;
//            }
//            Node last = head;
//            Node prev = head;
//            while (last.next != null) {
//                prev = last;
//                last = last.next;
//            }
//            prev.next = null;
//        }
//        void delAtpos(int pos) {
//            if (head == null) {
//                System.out.println("List is empty");
//                return;
//            }
//            int count = 1;
//            Node prev = head;
//            while (count < pos - 1) {
//                prev = prev.next;
//                count++;
//            }
//            Node curr = prev.next;
//            prev.next = curr.next;
//            curr.next = null;
//        }

//        void lengthLinkist() {
//            if (head == null) {
//                System.out.println("List is empty");
//                return;
//            }
//            Node last = head;
//            int count = 0;
//            while (last.next != null) {
//                last = last.next;
//                count++;
//            }
//            System.out.println();
//            System.out.println("length=" + (count + 1));
//            return;
//        }

//        void search(int pos) {
//            if (head == null) {
//                System.out.println("list is empty");
//                return;
//            }
//            Node last = head;
//            int position = 0;
//            while (last.next != null) {
//                last = last.next;
//                position++;
//                if (position == pos) {
//                    System.out.println();
//                    System.out.println("Element Found at Position " + pos + " which is " + last.data);
//                    return;
//                }
//            }
//        }

        //    void middleLinklist(){
//        if (head == null) {
//            System.out.println("list is empty");
//            return;
//        }
//        Node last = head;
//        int count =0;
//        double newv = 0;
//        while(last.next!=null){
//            count++;
//            last = last.next;
//        }
//        count++;
//        if (count%2==0){
//            System.out.println("even and not possible");
//        }else {
//            System.out.println("Odd");
//            newv = count/2;
//            System.out.println();
//        }
//    }
//        void reverse() {
//            if (head == null || head.next == null) {
//                System.out.println("list is empty");
//            }
//            Node prev = head;
//            Node curr = head.next;
//            while (curr != null) {
//                Node next = curr.next;
//                curr.next = prev;
//
//                prev = curr;
//                curr = next;
//            }
//            head.next = null;
//            head = prev;
//        }

//        void sortedLinkList() {
//            if (head == null) {
//                System.out.println("list is empty");
//                return;
//            }
//            int c = 0;
//            Node last = head;
//            while (last != null) {
//                last = last.next;
//                c++;
//            }
//            System.out.println("No of nodes " + c);
//
//            int d;
//            for (int i = 0; i < c; i++) {
//                Node temp = head;
//                Node temp1 = temp.next;
//                for (int j = 0; j < c - i - 1; j++) {
//                    if (temp.data > temp1.data) {
//                        d = temp.data;
//                        temp.data = temp1.data;
//                        temp1.data = d;
//                    }
//                    temp = temp1;
//                    temp1 = temp1.next;
//                }
//                // printList();
//            }
//       System.out.println("sorted list is ");
//        Node temp2 = head;
//        while (temp2 != null) {
//            System.out.println(temp2.data + " ");
//            temp2 = temp2.next;
//        }

//        void printList() {
//            if (head == null) {
//                System.out.println("list is empty");
//                return;
//            }
//            Node last = head;
//            while (last != null) {
//                System.out.print(last.data + " ");
//                last = last.next;
//            }
//        }
//
//        public static void main(String[] args) {
//            circularLinList list = new circularLinList();
//            list.addFirst(5);
//            list.addFirst(6);
//            list.addFirst(2);
//            list.addFirst(7);
//            list.addFirst(8);
//            list.printList();
//        list.addLast(1);
//        list.addLast(8);
//        list.delFirst(2);
//        list.delLast(8);
//        list.delAtpos(3);
//        list.search(2);
//        list.reverse();
//        list.sortedLinkList();
//            list.printList();
//            list.sortedLinkList();
//            list.reverse();
//            list.addFirst(3);
//            list.addFirst(4);
//            list.addFirst(5);
//            list.printList();

//        list.middleLinklist();
//        list.lengthLinkist();

//        }
//    }
//
