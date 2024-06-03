package Krishna_Bansal.src.Recursion_Practice;
import java.util.*;
public class Board_path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalCount = board(n, 0, "");
        System.out.println();
        System.out.println(totalCount);
    }
    public static int board(int n,int curr,String ans){
        if(curr==n){
            System.out.print(ans+ " ");
            return 1;
        }
        if(curr>n){
            return 0;
        }
        int count =0;
        for(int dice =1;dice<3;dice++){
          count+= board(n,curr+dice,ans+dice);
        }
        return count;
    }
}

