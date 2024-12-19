package String;

public class Longest_length {
    public static void main(String[] args) {
        String str = "abcd";
        Substring(str);
    }
    public static void Substring(String str){
        for(int len = 1;len<=str.length();len++){
            for(int j =len;j<=str.length();j++){
                int i =j-len;
                System.out.println(str.substring(i,j));

            }
        }
    }

}
