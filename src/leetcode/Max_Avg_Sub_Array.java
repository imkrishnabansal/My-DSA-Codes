package leetcode;

public class Max_Avg_Sub_Array {
    public static void main(String[] args) {
        int[]arr = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(subarray(arr,k));
    }
    public static double subarray(int[]arr,int k){
        int n = arr.length;
        int sum =0;
        for(int i =0;i<k;i++){
            sum += arr[i];
            }
        int maxsum = sum;
        for(int i =k;i<n;i++){
            sum+=arr[i] -arr[i-k];
            maxsum = Math.max(maxsum,sum);
        }
        return (double)maxsum/k;

    }
}
