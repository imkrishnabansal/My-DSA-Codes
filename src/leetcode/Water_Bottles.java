package leetcode;

public class Water_Bottles {
    public static void main(String[] args) {
        int numbottles =15;
        int numexchange =3;
        System.out.println(bottles(numbottles,numexchange));

    }
    public static int bottles(int numbottles,int numexchange){
        int total =0;
        int empty =0;
        while(numbottles>0){
            total =total+numbottles;
            empty =empty+numbottles;
           numbottles =empty;
          numbottles = empty/numexchange;
          empty = empty%numexchange;
        }
        return total;
    }
}
