public class DsaAsgnmntQ2 {
    int top;
    int max;
    int[] arr;
    DsaAsgnmntQ2 (int size){
        top = -1;
        max = size;
        arr=new int[max];
    }
    void push(int marks, String name)
    {
        if(top==max-1)
        {
            System.out.println("stack is overflow");
            return;
        }
        top++;
        arr[top]=marks;
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack is underflow");
        }
        System.out.println("deleted data is " + arr[top]);
        top--;
    }
    void sortLinkList(){
    }
    void printList()
    {
        if(top==-1)
        {
            System.out.println("stack is underflow");
            return;
        }
        for(int i=top;i>=0;i--)
            System.out.print(arr[i]+" ");
    }


    public static void main(String[] args) {
        DsaAsgnmntQ2 Stack = new DsaAsgnmntQ2(10);
        Stack.push(92,"rahul");
        Stack.push(79,"Rohit");
        Stack.push(98,"Anuj");
        Stack.push(78,"Jeshu");
        Stack.pop();
        System.out.println("The marks ans name of the students is ");
        Stack.printList();

    }
}