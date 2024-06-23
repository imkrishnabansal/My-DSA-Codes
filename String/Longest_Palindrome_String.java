package String;

public class Longest_Palindrome_String {
    public static void main(String[] args) {
        String s = "babad";
    }
    public static void palindromic(String s){
        String ans ="";
        for(int i =0;i<s.length();i++) {
            for (int j = s.length() - 1; j >= 0; j--) {
                if (s.charAt(i) != s.charAt(j)) {
                    j--;
                }
                i++;

                if (i == j){
                    System.out.println();
                }
            }
        }
    }

}
