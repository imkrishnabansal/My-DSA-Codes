import java.util.*;
public class chkSubsetArr {
    public static void main(String[] args) {;
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 2,1};
        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0; // Index for arr1
        int j = 0; // Index for arr2

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++; // Move to the next element in arr1
            } else if (arr1[i] == arr2[j]) {
                i++; // Move to the next element in arr1
                j++; // Move to the next element in arr2
            } else {
                System.out.println("arr2 is not a subset of arr1");
                return;
            }
        }
        // If all elements of arr1 are found in arr2, arr1 is a subset
        if (i == arr2.length) {
            System.out.println("arr2 is  not a subset of 1arr1");
        } else {
            System.out.println("arr2 is a subset of arr1");
        }

    }
}
