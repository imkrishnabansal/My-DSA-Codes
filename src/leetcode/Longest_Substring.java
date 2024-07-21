package leetcode;

import java.util.HashSet;

public class Longest_Substring {
    public static void main(String[] args) {
        String s = "abcabcb";
        System.out.println(substring(s));

    }
    public static int substring(String s){
    HashSet<Character> set = new HashSet<>();
    int maxlen =0;
    int right =0;
    int left =0;
   while(right<s.length()){
       if(!set.contains(s.charAt(right))){
           set.add(s.charAt(right));
           right++;
           maxlen = Math.max(maxlen,right-left);

       }
       else{
           set.remove(s.charAt(left));
           left++;
       }
   }
   return maxlen;
    }

}
