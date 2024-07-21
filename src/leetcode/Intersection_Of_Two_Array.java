package leetcode;
import java.util.*;
public class Intersection_Of_Two_Array {
    public static void main(String[] args) {
        int[]arr1 = {2,2,1,1};
        int[]arr2 = {2,2};
        int[] result = array(arr1, arr2);
        System.out.println(Arrays.toString(result));

    }
    public static int[] array(int[]nums1,int[]nums2){
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int num : nums1) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        // Use a list to store the intersection elements
        List<Integer> intersection = new ArrayList<>();
        for (int num : nums2) {
            if (counts.containsKey(num) && counts.get(num) > 0) {
                intersection.add(num);
                counts.put(num, counts.get(num) - 1);
            }
        }
        int[]result = new int[intersection.size()];
        for(int i =0;i< intersection.size();i++){
            result[i] =  intersection.get(i);
        }
        return result;
    }
}

