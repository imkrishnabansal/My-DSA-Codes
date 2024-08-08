package Binary_Search;

public class Largest_subarray_sum {
    public static void main(String[] args) {
        int[]arr = {10,20,30,40};
        int k =2;
        System.out.println(LargestSum(arr,k));

    }
    public static int CountNumber(int[]arr,int Number){
        int painter =1;
        int countsum =0;
        for(int i =0;i<arr.length;i++){
            if(countsum +arr[i]>Number){
                painter++;
                countsum = arr[i];
            }
            else{
                countsum+=arr[i];
            }
        }
        return painter;
    }
    public static int maxi(int[]arr){
        int max = Integer.MIN_VALUE;
        for(int i =0; i<arr.length;i++){
            if(arr[i]>max){
                max =arr[i];
            }
        }
        return max;
    }
    public static int sums(int[]arr){
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum =sum+arr[i];
        }
        return sum;
    }
    public static int LargestSum(int[]arr,int k){
        int n =arr.length;
        int low = maxi(arr);
        int high = sums(arr);
        while(low<=high){
            int mid =(low+high)/2;
            int painters = CountNumber(arr,mid);
            if(painters>k){
                low =mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
}
