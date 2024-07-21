package leetcode;

import java.util.HashMap;

public class Subarray_sums_div_K {
    public static void main(String[] args) {
        int[]nums = {4,5,0,-2,-3,1};
        int k =5;
        System.out.println(subarray(nums,k));
    }
    public static int subarray(int[]arr,int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            int rem = sum % k;
            if (rem < 0) {
                rem += rem + k;
            }
            if (map.containsKey(rem)) {
                count += map.get(rem);
            }

        map.put(rem,map.getOrDefault(rem,0)+1);
    }
        return count;
    }
}
