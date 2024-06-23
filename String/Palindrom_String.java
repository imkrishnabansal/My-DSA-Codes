package String;

import java.io.PrintStream;

public class Palindrom_String {
    public static void main(String[] args) {
        String s = "NamaN";
        System.out.println(palindrome(s));
    }
    public static boolean palindrome(String s){
        for(int i =0;i<s.length();i++){
            for(int j =s.length()-1;j>=0;j--){
                if(s.charAt(i)==s.charAt(j)){
                   return true;
                }
                else{
                  return false;
                }
            }

        }

        return false;
    }
}
