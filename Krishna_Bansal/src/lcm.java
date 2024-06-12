package Krishna_Bansal.src;

import java.util.*;
public class lcm {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 =sc.nextInt();
        int n2 =sc.nextInt();
        System.out.println(lcm(n1,n2));
    }
    public static int lcm(int n1,int n2){
        int count =0;
        while(n1>0&&n2>0){
            if(n1%2==0||n2%2==0){
                count = count*2;
            }
            count =count*3;
        }
        return count;

    }
}
