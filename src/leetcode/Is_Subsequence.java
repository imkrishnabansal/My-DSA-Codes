package leetcode;

public class Is_Subsequence {
    public static void main(String[] args) {
        String s= "abc";
        String t = "adfcghbf";
        System.out.println(subsequence(s,t));
    }
    public static boolean subsequence(String s ,String t ){
        int n = s.length();
        int k = t.length();
        int i =0;
        int j =0;
        while(i<n&&j<k){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        if(i==n){
            return true;
        }
        return false;
    }
}
