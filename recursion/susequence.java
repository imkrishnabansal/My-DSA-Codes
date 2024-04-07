package recursion;

public class susequence {
    public static void main(String[] args) {
        String ques = "abc";
        printsubsqnc(ques,"");
    }
    public static void printsubsqnc(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        printsubsqnc(ques.substring(1),ans);
        printsubsqnc(ques.substring(1),ans+ch);
    }
}
