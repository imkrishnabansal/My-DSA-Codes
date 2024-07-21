package leetcode;
import java.util.*;
public class Subarr_Sum_Equal_K {
    public static void main(String[] args) {
        int[]arr = {1,1,1};
        int k =2;
        HashMap<Integer,Integer> map = new HashMap<>();//sum ,freq
        map.put(0,1);
        int ans =0;
        int sum =0;
        for(int j =0;j<arr.length;j++){
            sum+=arr[j];
            if(map.containsKey(sum-k)){
                ans+= map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.getOrDefault(sum,0)+1);

            }
            else{
                map.put(sum,1);
            }

        }
        System.out.println(ans);


    }
}
