package Hashing;
import java.util.*;
public class Majority_Element {
    public static void main(String[] args) {
        int[]nums = {1,3,2,5,1,3,2,1,5,1};
        System.out.println(element(nums));

    }
    public static int element(int[]arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i =0;i<n;i++){
            if(map.containsKey(arr[i])==true){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)>n/3){
               return key;
            }
        }
        return -1;
    }

}
