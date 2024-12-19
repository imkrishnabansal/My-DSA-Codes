package Arrays;

public class Missing_num {
    public static void main(String[] args) {
        int[] arr1 = {3, 0, 1};
        int[] arr2 = {1, 2, 4};
        int[] arr3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println(number(arr1)); // Expected output: 2
        System.out.println(number(arr2)); // Expected output: 3
        System.out.println(number(arr3)); // Expected output: 8
    }

    public static int number(int[] arr) {
        int n = arr.length;
        int xor1 = 0;
        int xor2 = 0;

        // XOR all the elements in the array
        for (int i = 0; i < arr.length; i++) {
            xor1 ^= arr[i];
        }

        // XOR all numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            xor2 ^= i;
        }

        // The missing number is the XOR of these two results
        return xor1 ^ xor2;
    }
}
