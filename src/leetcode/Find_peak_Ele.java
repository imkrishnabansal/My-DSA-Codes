package leetcode;

public class Find_peak_Ele {
    public static void main(String[] args) {
        int[]arr = {1,2,3,1};
        System.out.println(peak(arr));
    }
    public static int peak(int[]arr){
        int n =arr.length;
        if(n==1){
            return 0;
        }
        if(arr[0]>arr[1]){
            return arr[0];
        }
        if(arr[n-1]>arr[n-2]){
            return arr[n-1];
        }
        int l =0;
        int h = n-2;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                    return mid;
            }
            else if(arr[mid]>arr[mid-1]){
                l =mid+1;
            }
            else{
                h =mid+1;
            }
        }
        return -1;
    }
}
