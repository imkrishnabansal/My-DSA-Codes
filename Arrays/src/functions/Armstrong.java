package Arrays.src.functions;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(Armstrong(n));
    }
    public static boolean Armstrong(int n){
        int c = countdigit(n);
        int sum =0;
        int p =n;
        while(n>0){
            int rem = n%10;
             sum = (int)(sum+ Math.pow(rem,c));
             n = n/10;
        }
        if(sum==p){
            return true;
        }
        else{
            return false;
        }
    }
    public static int countdigit(int n){
        int count =0;
        while(n>0){
            count++;
            n =n/10;
        }
        return count;
    }
}
