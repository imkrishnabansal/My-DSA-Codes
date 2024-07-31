package leetcode;

import java.util.HashMap;

public class Max_Num_K_Sum {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4};
        int k =5;
        System.out.println(number(arr,k));
    }
    public static int number(int[]arr,int k){
        HashMap<Integer,Integer> map  = new HashMap<Integer, Integer>();
        int n = arr.length;
        int count =0;
        for(int i =0;i<n;i++){
            int compliment = k-arr[i];
            if(map.getOrDefault(compliment,0)>0){
                count++;
                map.put(compliment,map.get(compliment)-1);
            }
            else{
                map.put(arr[i],map.getOrDefault(arr,0)+1);
            }
        }
        return count;


    }

}
