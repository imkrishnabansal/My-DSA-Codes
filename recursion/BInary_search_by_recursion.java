package recursion;

public  class BInary_search_by_recursion {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 9}; // Corrected the array initialization
        int target = 9;
        int result = bs(arr, target, 0, arr.length - 1);

       if (result == -1) {
          System.out.println("Element not found");
      } else {
         System.out.println("Element found at index: " + result);
       }
    }

    public static int bs(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1; // Element not found
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return bs(arr, target, mid + 1, end);
        } else {
            return bs(arr, target, start, mid - 1);
        }
    }
}