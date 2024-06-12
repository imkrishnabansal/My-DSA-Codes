import java.util.*;


class Sorting {
    public static void main(String args[]) {
        int arr[] = {7, 8, 1, 3, 2};
        // Insertion sort
        insertionSort(arr);
        // Print the sorted array
        printArray(arr);
    }
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void insertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > current) {
                // Keep swapping
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
}
