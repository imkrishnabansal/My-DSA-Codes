package Arrays.src;
import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int res =0;
        int n1 =sc.nextInt();
        int n2 =sc.nextInt();
        int gcd = findGCD(n1,n2);
        System.out.println(gcd);
        sc.close();
    }
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);

    }
}
