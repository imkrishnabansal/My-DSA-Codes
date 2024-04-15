package recursion;
import java.util.*;
import java.util.ArrayList;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int n =3;
        List<String> ll = new ArrayList<>();
        gp(n,0,0,"",ll);
        System.out.println(ll);
    }
    public static void gp(int n,int open ,int close,String ans ,List<String> ll){
        if(open==n && close==n){
            ll.add(ans);

            return;
        }
        if(open<n) {
            gp(n, open + 1, close, ans + "(",ll);
        }
        if(close<open){
            gp(n,open,close+1,ans+")",ll);
        }
    }
}
