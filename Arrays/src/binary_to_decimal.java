package Arrays.src;
import java.util.*;
public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(binary(n));

    }
    public static int binary(int n){
        int sum=0;
        int base =1;
        while(n>0){
            int digit = n%10;
            sum = sum +digit*base;
            base = base*2;
            n = n/10;
        }
        return sum;
    }

 }
