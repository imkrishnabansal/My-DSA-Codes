//public class recursion {
//    public static  void TowerOfHanoi(int n,String src ,String helper,String dest){
//        if(n==1){
//            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
//            return;
//        }
//        TowerOfHanoi(n-1, src,dest,helper);
//        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
//        TowerOfHanoi(n-1,helper,src,dest);
//
//    }
//    public static void main(String[] args) {
//        int n = 3;
//        TowerOfHanoi(n,"S" , "H" ,"D");


//    factorial
//    public static int fact(int n){
//        if(n==0||n==1){
//            return 1;
//        }
//        else{
//            return n*fact(n-1);
//        }
//    }
//
//    public static void main(String[] args) {
//        int n = 5;
//        int result = fact(n);
//        System.out.println("fact of " + n + " is " + result);

//    public static void printTable(int number, int multiplier) {
//        if (multiplier <= 10) {
//            System.out.println(number + " * " + multiplier + " = " + (number * multiplier));
//            printTable(number, multiplier + 1);
//        }}
//    public static void main(String[] args) {
//        for (int i = 5; i <= 5; i++) {
//            System.out.println("Multiplication table for " + i + ":");
//            printTable(i, 1);
//            System.out.println(); // Add a new line between tables
//        }
//    }
//}
//public static int fabbonacci(int n){
//    if(n==0||n==1){
//        return 2;
//    }
//    else{
//        return n + fabbonacci(n-1);
//    }
//}

//    public static void main(String[] args) {
//        int n = 3;
//        int result = fabbonacci(n);
//        System.out.println("fabonacci of " + n + " is " + result);
//
//    }
//}


    //TIME COMPLEXITY OF TOWER OF HANOI IS O(2^n-1) = O(2^n)


