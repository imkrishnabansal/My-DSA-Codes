package Hashing;
import java.util.*;
public class Union_arr {
    public static void main(String[] args) {
        int[]arr1 = {1,2,2,3,4,6};
        int[]arr2 = {2,3,2,49,5,7,8,9};
//        System.out.println(array(arr1,arr2));
        System.out.println(intersection(arr1,arr2));

    }
    public static int array(int[]arr1,int[]arr2){
        HashSet<Integer> set  = new HashSet<>();
        for(int i =0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j =0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        System.out.println(set + " ");
        return set.size();
    }
    //Intersetion
    public static int intersection(int[] arr1, int[] arr2) {
        int count = 0;
        HashSet<Integer> set1 = new HashSet<>();
        List<Integer> intersectionElements = new ArrayList<>();

        // Add elements from arr1 to set1
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }

        // Check for intersection with arr2
        for (int j = 0; j < arr2.length; j++) {
            if (set1.contains(arr2[j])) {
                count++;
                intersectionElements.add(arr2[j]); // Store intersecting element
                set1.remove(arr2[j]);
            }
        }

        // Print the intersecting elements
        System.out.println("Intersecting elements: " + intersectionElements);

        return count;
    }
}