package leetcode;

import java.util.HashMap;

public class Subarr_Prod_Less_than_K {
    public static void main(String[] args) {
        int[] nums = {10,5,2,6};
        int k = 100;
        System.out.println(subarray(nums, k));
    }

    public static int subarray(int[] arr, int k) {
        if (k <= 1) return 0;

        int count = 0;
        int prod = 1;
        int left =0;
        for(int i =0;i<arr.length;i++){
            prod = prod*arr[i];
            while(prod>=k){
                prod/=arr[left++];
            }

            count+=i-left+1;
        }

        return count;
    }
}
