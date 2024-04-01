import java.util.*;
public class rvrsearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int arr[] = new int[n];
        int digit =n;
        while(n>0){
            digit = n%10;
            System.out.print(digit);
            n = n/10;
        }
    }
}
