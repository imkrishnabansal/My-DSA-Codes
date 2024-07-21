package leetcode;

import java.util.HashMap;

public class Continous_Subarr_Sum {
    public static void main(String[] args) {
        int[]arr = {23,2,4,6,6};
        int k =13;
        System.out.println(subarray(arr,k));

    }
    public static boolean subarray(int[]arr,int k) {
       if(k==0){
           for(int i =0;i<arr.length;i++){
               if(arr[i]==0&&arr[i+1]==0){
                   return true;
               }
               else{
                   return false;
               }
           }
           return false;
       }
        HashMap<Integer,Integer>map = new HashMap<>();//sum and index
       map.put(0,-1);
       int sum =0;
       for(int i =0;i<arr.length;i++){
           sum =sum+arr[i];
           int mod =sum %k;
           if(mod<0){
               mod =mod+k;
           }
           if(map.containsKey(mod)) {
               if (i - map.get(mod) > 1) {
                   return true;
               }
           }
               else{
                   map.put(mod,i);
               }
           }
           return false;
       }
    }

