package Gfg_problems;

import java.util.HashSet;
import java.util.Set;

public class Pairs_exist_In_Array {
    public static void main(String[] args) {
        int[]arr = {11,15,6,8,9,10};
        int sum =16;
        System.out.println(pairs(arr,sum));

    }
    public static boolean pairs(int[]arr,int sum){
        if(arr.length==0){
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            if(set.contains(sum-arr[i])){
                return true;
            }
            else{
                set.add(arr[i]);
            }
        }
        return false;
    }
}
