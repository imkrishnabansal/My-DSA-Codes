package recursion;

public class Board_path {
    public static void main(String[] args) {
        int n =4;
        Printans(n,0,"");
    }
   public static void Printans(int n,int curr,String ans){
        if(curr==n){
            System.out.println(ans);
            return;
        }
        if(curr>n){
            return;
        }
        for(int dice = 1;dice<=3;dice++){
            Printans(n, curr+dice, ans+dice);
        }
//       Printans(n,curr+1,ans+1);
//       Printans(n,curr+2,ans+2);
//       Printans(n,curr+3,ans+3);
   }
}
