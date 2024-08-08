package Binary_Search;

import java.util.Arrays;

public class Aggressive_Cow {
    public static void main(String[] args) {
        int[]arr = {0,3,4,7,10,9};
        int cow = 4;
        System.out.println(aggressivecow(arr,cow));
    }
    public static boolean canweplace(int[]arr,int dist,int cow){
        int cnt = 1;
        int last  =arr[0];
        for(int i =1;i<arr.length;i++) {
            if (arr[i] - last >= dist) {
                cnt++;
                last = arr[i];
            }
            if (cnt >= cow)
                return true;
        }
            return false;
    }
    public static int aggressivecow(int[]arr,int cow){
        int n = arr.length;
        Arrays.sort(arr);
        int low =1;
        int high =arr[n-1] -arr[0];
        while(low<=high){
            int mid  = (low+high)/2;
            if(canweplace(arr,mid,cow)){
                low =mid+1;
            }
            else{
                high =mid-1;
            }
        }
        return high;
    }
}
