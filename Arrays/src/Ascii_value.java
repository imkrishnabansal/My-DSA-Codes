package Arrays.src;

public class Ascii_value {
    public static void main(String[] args) {
        String s = "krishna";
       int result =  calculateScore(s);
        System.out.println(result);
    }
    public static int  calculateScore(String s){
      int score  =0;
      for(int  i = 0;i<s.length()-1;i++){
          int ascii1 = (int)(s.charAt(i));
          int ascii2 = (int)(s.charAt(i+1));
          score = score + Math.abs(ascii1 - ascii2);
      }
      return score;
    }
}
