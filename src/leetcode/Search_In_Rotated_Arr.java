package leetcode;

public class Search_In_Rotated_Arr {
    public static void main(String[] args) {
        int[]arr = {4,5,6,7,0,1,2,};
        int target =1;
        System.out.println(search(arr,target));
    }
    public static int search(int[]arr,int target){
        int s =0;
        int e =arr.length-1;
        while(s<=e){
            int mid = s+ (e-s)/2;
                if(arr[mid]==target){
                    return mid;
                }
                if(arr[s]<=arr[mid]) {
                    if  (arr[s] <= target && target < arr[mid]) {
                        e = mid - 1;
                    } else {
                        s = mid + 1;
                    }
                }
                  else{
                      if(arr[mid]<target&&target<=arr[e]){
                          s = mid+1;
                      }
                      else{
                          e =mid-1;
               }
            }
        }
            return -1;
    }
}
