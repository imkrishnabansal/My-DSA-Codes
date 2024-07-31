package Binary_Search;

public class Smallest_div_given_threshold {
    public static void main(String[] args) {
        int[]arr = {1,2,5,9};
        int th =6;
        System.out.println(possible(arr,th));
    }
    public static int possible(int[]arr,int th){
       int n =arr.length;
       if(n>th){
           return -1;
       }
       int max = Integer.MAX_VALUE;
       for(int i =0;i<n;i++){
            max = Math.max(max,arr[i]);
       }
        int result =-1;
       int lo = 1;
       int hi = max;
       while(lo<=hi) {
           int mid = lo+(hi -lo) / 2;
           if(sumd(arr,mid)<=th){
               result =mid;
               hi =mid-1;
           }
           else{
               lo = mid+1;
           }
       }
       return result;

    }
    public static int sumd(int[]arr,int div){
        int n =arr.length;
        int sum =0;
        for(int i =0;i<n;i++){
            sum += Math.ceil((double)(arr[i]) / (double)(div));
        }
        return sum;
    }
}
