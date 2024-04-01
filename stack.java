public class stack {
    int top;
    int max;
    int[] a;

    stack(int size) {
        max = size;
        top = -1;
        a = new int[max];
    }

    void push(int ele) {
        if (top == max - 1) {
            System.out.println("stack is overflow");
            return;
        }
        top++;
        a[top] = ele;
    }

    int pop() {
        if (top == -1) {
            System.out.println("stack is underflow");
            return -1;
        }
        return a[top--];
    }

    void sort() {
        stack tempStack = new stack(max);
        while (!isEmpty()) {
            int temp = pop();
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        // Move elements from temporary stack back to the original stack
        while (!tempStack.isEmpty()) {
            push(tempStack.pop());
        }
    }

    boolean isEmpty() {
        return top == -1;
    }

    int peek() {
        return a[top];
    }

    void printstack() {
        if (top == -1) {
            System.out.println("underflow stack");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        stack s = new stack(10);
        s.push(8);
        s.push(4);
        s.push(3);
        s.push(7);
        System.out.println("Original stack:");
        s.printstack();
        s.pop();

        // Sort the stack
//        s.sort();
//        System.out.println("Sorted stack:");
        s.printstack();
    }
}