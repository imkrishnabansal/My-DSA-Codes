package strings;

public class Longest_Palindromic_substring {
    public static void main(String[] args) {
        String s = "babad";
    }
    public static int substring(String s){
        int flag =0;
        int strt =0;
        int end =s.length()-1;
        for(int i =0;i<s.length();i++){
            for(int j =s.length()-1;j>=0;j++){
                if(s.charAt(i)==s.charAt(j)){
                   flag =1;

                }
                else{
                    i++;
                    j--;
                }
            }
        }
        return 1;
    }
}
