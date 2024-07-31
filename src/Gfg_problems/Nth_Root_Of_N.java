package Gfg_problems;

public class Nth_Root_Of_N {
    public static void main(String[] args) {
        int n =3;
        int m =9;
        System.out.println(Root(n,m));

    }
    public static int Root(int n,int m){
        int l =1;
        int h =m;
        while(l<=h){
            int mid = (l+h)/2;
            if (n==m){
                return mid;
            }
            else if(mid*n<=m){
                n--;
                l = mid+1;
            }
            else{
                h =mid+1;
            }
        }
        return h;
    }
}
