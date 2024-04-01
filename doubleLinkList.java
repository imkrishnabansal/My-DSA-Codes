public class doubleLinkList {
    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
            next = null;
            prev=null;
        }
    }

    void addFirst(int d) {
        Node newnode = new Node(d);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
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
        newnode.prev=last;
    }
    void delFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
      head = head.next;
        head.prev = null;
        }
        void delLast() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            Node last = head;
            while(last.next!=null){
                last = last.next;
            }
            last.prev.next = null;
        }
    void delAtpos(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        int count = 1;
        Node prev = head;
        while (count < pos - 1) {
            prev = prev.next;
            count++;
        }
        Node curr = prev.next;
        prev.next = curr.next;
        curr.next = null;
    }

    void lengthLinkist() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node last = head;
        int count = 0;
        while (last.next != null) {
            last = last.next;
            count++;
        }
        System.out.println();
        System.out.println("length=" + (count + 1));
        return;
    }

    void search(int pos) {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node last = head;
        int position = 0;
        while (last.next != null) {
            last = last.next;
            position++;
            if (position == pos) {
                System.out.println();
                System.out.println("Element Found at Position " + pos + " which is " + last.data);
                return;
            }
        }
    }

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
    void reverse() {
        if (head == null || head.next == null) {
            System.out.println("list is empty");
        }
        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
    }

    void sortedLinkList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        int c = 0;
        Node last = head;
        while (last != null) {
            last = last.next;
            c++;
        }
        System.out.println("No of nodes " + c);
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c - i - 1; j++) {
                Node temp = head;
                Node temp1 = temp.next;
                int d;
                if (temp.data > temp1.data) {
                    d = temp.data;
                    temp1.data = temp.data;
                    temp.data = d;
                }
                temp = temp1;
                temp1 = temp1.next;
            }
        }
        System.out.println("sorted list is ");
        Node temp2 = head;
        while (temp2 != null) {
            System.out.println(temp2.data + " ");
            temp2 = temp2.next;
        }
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
        doubleLinkList list=new doubleLinkList();
        list.addFirst(0);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.delFirst();
        list.delLast();
        list.printList();
    }
}