package codeforces;
import java.util.*;
public class Game_With_Integers {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int testCase = 0; testCase < t; testCase++) {
            int n = sc.nextInt();
         if (n%3==1||n%3==2){
                System.out.println("First");
            }
            else{
                System.out.println("Second");
            }
        }
    }
}
