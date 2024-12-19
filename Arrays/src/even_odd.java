package Arrays.src;
import java.util.*;
public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int even =0;
        int odd =0;
        boolean iseven = true;
        while(n>0){
            int digit = n%10;
            if(iseven){
                even = even+digit;
            }
            else{
                odd = odd+digit;
            }
            n = n/10;
            iseven = !iseven;
        }
        System.out.println(even);
        System.out.println(odd);

    }
}

