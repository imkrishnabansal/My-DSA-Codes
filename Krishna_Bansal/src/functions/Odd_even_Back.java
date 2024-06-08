package Krishna_Bansal.src.functions;
import java.util.*;
public class Odd_even_Back {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t>0){
            int carno = sc.nextInt();
            if(oddeven(carno)==true){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            t--;
        }
    }
    public static boolean oddeven(int n){
        int sum =0;
      while(n>0){
          int rem = n%10;
          sum = sum+rem;
          n =n/10;
      }
      if(sum%3==0||sum%4==0){
          return true;
      }
      else {
          return false;
      }

    }

    }
