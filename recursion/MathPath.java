package recursion;

import java.util.*;
public class MathPath {
    public static void main(String args[]) {
        // Your Code Here
        int n =3;
        int m =3;
        printpath(0,0,n-1,m-1,"");
    }
    static void printpath(int cc,int cr,int ec,int er,String ans){
        if(cc==0&&cr==0){
            System.out.println(ans);
            return;
        }
        if(cc>ec||cr>er){
            return;
        }
        printpath(cc+1,cr,ec,er,ans + "H");
        printpath(cc,cr+1,ec,er,ans + "V");
        printpath(cc+1,cr+1,ec,er,ans + "D");
    }

}
