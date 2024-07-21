package leetcode;

import java.util.Arrays;

public class Next_permutation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        permutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void permutation(int[] arr) {
        int n = arr.length;
        int i;

        // Step 1: Find the pivot
        for (i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                break;
            }
        }

        // If we found a pivot
        if (i >= 0) {
            int j;
            // Step 2: Find the successor
            for (j = n - 1; j > i; j--) {
                if (arr[j] > arr[i]) {
                    break;
                }
            }
            // Step 3: Swap pivot and successor
            swap(arr, i, j);
        }

        // Step 4: Reverse the suffix
        reverse(arr, i + 1, n - 1);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int s, int e) {
        while (s < e) {
            swap(arr, s, e);
            s++;
            e--;
        }
    }
}
