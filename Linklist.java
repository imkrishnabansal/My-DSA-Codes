public class Linklist {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
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
        void printlist(){
            if(head==null){
                System.out.println("list is empty");
                return;
            }
            Node last = head;
            while(last!=null){
                System.out.println(last.data + " ");
                last = last.next;
            }
        }

    public static void main(String[] args) {
        Linklist list = new Linklist();
        list.printlist();
        list.addFirst(3);
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(4);
        list.printlist();
    }
}


