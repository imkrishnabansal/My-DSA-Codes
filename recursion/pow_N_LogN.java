package recursion;

public class pow_N_LogN {
    public static void main(String[] args) {
        int a =3;
        int n =5;
        System.out.println(pow(a,n));
    }
    public static int pow(int a,int n){
        if(n==0){
            return 1;
        }
       int ans =  pow(a,n/2);
        ans = ans*ans;
        if(n%2!=0){
            ans*=a;
        }
        return ans;
    }
}
//?complexity is O(logn)
