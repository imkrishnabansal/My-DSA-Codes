package Geeks_For_Geeks;

public class Summed_Matrix {
    public static void main(String[] args) {
        long n =4;
        long q =7;
        System.out.println(matrix(n,q));
    }
    public static long matrix(long n,long q){
       if(q<2||q>2*n){
           return 0;
       }
       else{
           return Math.min(q-1,2*n-q+1);
       }
    }
}
