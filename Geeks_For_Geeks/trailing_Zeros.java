package Geeks_For_Geeks;
import java.util.*;

public class trailing_Zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long k = sc.nextInt();
        System.out.println(round(n,k));
    }

    public static int round(long n, long k) {
        int rounding = (int) Math.pow(10, k);
        int res = gcd(rounding, n);

        return (int)((rounding * n) / res);
    }
    public static int gcd(long a,long b){
        while(b!=0){
            long temp =b;
            b = a%b;
            a = temp;
        }
        return (int)a;
    }
}
