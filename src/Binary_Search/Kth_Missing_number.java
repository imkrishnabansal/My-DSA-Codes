package Binary_Search;

public class Kth_Missing_number {
    public static void main(String[] args) {
        int[]arr = {2,3,4,7,11};
        int k =5;
        System.out.println(Number(arr,k));

    }
    public static int Number(int[]arr,int k){
        int n = arr.length;
        int low =0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            int missing = arr[mid] - (mid+1);
            if(missing<k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low+k;
    }

}
