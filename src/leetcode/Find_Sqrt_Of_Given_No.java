package leetcode;

public class Find_Sqrt_Of_Given_No {
    public static void main(String[] args) {
        int n =27;
        System.out.println(sqrt(n));

    }
    public static int sqrt(int n){
        int l = 1;
        int h = n;
        while(l<=h){
            int mid = l+(h-l)/2;
            if((mid*mid)<=n){
                l =mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return h;
    }
}
