package Arrays.src;
import java.util.*;
public class countDigit {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            int digit = sc.nextInt();
            System.out.println(counts(n,digit));
        }
        public static int counts(int n,int digit){
            int count =0;
            while(n>0){
                int no = n%10;
                if(no==digit){
                    count++;
                }
                n =n/10;
            }
            return count;
    }
}
