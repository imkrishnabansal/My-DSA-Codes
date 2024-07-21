package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int[] arr = {100, 102, 100, 101, 101, 4, 3, 2, 1, 3, 3, 2, 200, 1, 3, 6, 5, 2};
        System.out.println(sequence(arr));
    }

    public static int sequence(int[] arr) {
//        int n = arr.length;
//        if(n==0){
//            return 0;
//        }
//        Arrays.sort(arr);
//        int longest =1;
//        int count =0;
//        int lastSmaller  = Integer.MIN_VALUE;
//        for(int i =0;i<arr.length;i++){
//            if(arr[i]-1==lastSmaller){
//                count = count+1;
//                lastSmaller = arr[i];
//            }
//            else if(arr[i]!=lastSmaller){
//                count =1;
//                lastSmaller =arr[i];
//            }
//            longest =Math.max(longest,count);
//        }
//        return longest;
//    }
// overall tc is O(nlogn);
//overall sc is O(n);

        int n = arr.length;
        if (n == 0) {
            return 0;
        }
        int longest = 1;
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int it : set) {
            if (!set.contains(it - 1)) {
                count = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    count = count + 1;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;

    }
}
//tc and sc are O(n) due to hashset
