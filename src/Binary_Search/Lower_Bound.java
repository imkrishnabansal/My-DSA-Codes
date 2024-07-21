package Binary_Search;

public class Lower_Bound {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,9,9};
        int x = 9;
        System.out.println(lb(arr,x));
    }
    public static int lb(int[]arr,int x){
       int n = arr.length;
       int ans =n;
       int low =0;
       int high = n-1;
       while(low<=high){
           int mid = (low+high)/2;
           if(arr[mid]>=x){
               ans =mid;
               high = mid-1;
           }
           else{
               low =mid+1;
           }
       }
       return ans;

    }
}
