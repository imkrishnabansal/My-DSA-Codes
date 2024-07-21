package leetcode;

public class Increasing_Triplet_Seq {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        System.out.println(sequence(arr));
    }
    public static boolean sequence(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return false;
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num <= first) {
                first = num;  // update first if num is smaller
            } else if (num <= second) {
                second = num;  // update second if num is larger than first but smaller than second
            } else {
                return true;  // return true if you find a number larger than both first and second
            }
        }

        return false;  // return false if no triplet is found
    }
}