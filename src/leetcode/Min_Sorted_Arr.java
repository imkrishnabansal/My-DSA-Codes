package leetcode;

import java.util.Arrays;

public class Min_Sorted_Arr {
    public static void main(String[] args) {
        int[]arr = {3,4,5,2};
        System.out.println(minimum(arr));
    }
    public static int minimum(int[]arr){
        int n =arr.length;
        if(n==1){
            return arr[0];
        }
        int s =0;
        int e = arr.length-1;
        if(arr[s]<arr[e]){
            return arr[s];
        }
        while(s<=e) {
            int mid = s + (e - s) / 2;
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            }
            if (mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            }
            if (arr[mid] >= arr[s]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
}
