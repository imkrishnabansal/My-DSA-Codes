package leetcode;

public class Winner_Of_Circular_Game {
    public static void main(String[] args) {
        int n =5;
        int k =2;
        System.out.println(game(n,k));

    }
    public static int game(int n,int k){
        int win =0;
        for(int i =1;i<=n;i++){
          win = (win+k)%i;
        }
       return win+1;
    }
}
