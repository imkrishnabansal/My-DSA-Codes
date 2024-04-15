package recursion;
import java.util.*;
public class Permutation {
    public static void main(String[] args) {
        String ques = "abc";
        System.out.println(CountPermutation(ques,""));
    }
    public static int CountPermutation(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return 1;
        }
        int count =0;
        for(int i =0;i<ques.length();i++){
            char ch = ques.charAt(i);
            String s1 = ques.substring(0,i);
            String s2 = ques.substring(i+1);
            count += CountPermutation(s1+s2 ,ans+ch);
        }
        return count;
    }
}
