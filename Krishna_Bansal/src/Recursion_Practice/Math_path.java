package Krishna_Bansal.src.Recursion_Practice;
import java.util.*;
public class Math_path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        int totalcount = countno(0,0,n-1,m-1,"");
        System.out.println();
        System.out.println(totalcount);
    }
    public static int countno(int cc,int cr,int ec,int er,String ans){
        if(cc==ec&&cr==er){
            System.out.print(ans + " ");
            return 1;
        }
        if(cc>ec||cr>er){
            return 0;
        }
        int count =0;
       count+= countno(cc+1,cr,ec,er,ans+"H");
       count+= countno(cc,cr+1,ec,er,ans+"V");
        count+=countno(cc+1,cr+1,ec,er,ans+"D");
        return count;
    }
}
