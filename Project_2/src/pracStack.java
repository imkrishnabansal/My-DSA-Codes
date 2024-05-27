package Project_2.src;
import java.util.*;
public class pracStack {
    int top;
    int max;
    int[] arr;

    pracStack(int size) {
        top = -1;
        max = size;
        arr = new int[max];
    }

    void push(int ele) {
        if (top == max-1) {
            System.out.println("Staqck is over flow");
        }
        top++;
        arr[top] = ele;
    }
    void printStack(){
        if(top==-1){
            System.out.println("underflow");
        }
        for(int i =top;i>=0;i--){
            System.out.println(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        pracStack st = new pracStack(10);
//        PracLinklist list = new PracLinklist();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements to add:");
        int count = sc.nextInt();

        System.out.println("Enter the elements:");
        while (count-- > 0) {
            int element = sc.nextInt();
            st.push(element);
        }
        System.out.println("Linked List:");
        st.printStack();
    }
}

