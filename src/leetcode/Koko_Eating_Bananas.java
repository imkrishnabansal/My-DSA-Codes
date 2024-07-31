package leetcode;

public class Koko_Eating_Bananas {
    public static void main(String[] args) {
        int[]arr = {3,6,7,11};
        int h =8;
      int ans = EatingBanana(arr,h);
        System.out.println(ans);

    }
    public static int findMax(int[]arr){
        int maxi = Integer.MIN_VALUE;
        int n =arr.length;
        for(int i =0;i<n;i++){
            maxi = Math.max(maxi,arr[i]);
        }
        return maxi;
    }
    public static int caltotalhours(int[]arr,int hourly){
        int totalh = 0;
        int n =arr.length;
        for(int i =0;i<n;i++){
            totalh += Math.ceil((double)(arr[i]) / (double)(hourly));
        }
        return totalh;
    }
    public static int EatingBanana(int[]arr ,int h){
        int low =1;
        int high = findMax(arr);
        while(low<=high) {
            int mid = (low + high) / 2;
            int totalh = caltotalhours(arr, mid);
            if (totalh <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
            return low;
        }
  }
