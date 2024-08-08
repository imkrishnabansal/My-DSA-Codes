package leetcode;

public class Median_two_sorted_arr {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4};
        int[] arr2 = {1, 3};

        double median = findMedianSortedArrays(arr1, arr2);
        System.out.println("Median is: " + median);
    }

    public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n = n1 + n2;
        int idx1 = -1;
        int idx2 = -1;
        int i = 0, j = 0, count = 0;

        while (i < n1 && j < n2) {
            int val;
            if (arr1[i] < arr2[j]) {
                val = arr1[i++];
            } else {
                val = arr2[j++];
            }

            if (count == n / 2 - 1) {
                idx1 = val;
            }
            if (count == n / 2) {
                idx2 = val;
            }

            count++;
        }

        while (i < n1) {
            int val = arr1[i++];

            if (count == n / 2 - 1) {
                idx1 = val;
            }
            if (count == n / 2) {
                idx2 = val;
            }

            count++;
        }

        while (j < n2) {
            int val = arr2[j++];

            if (count == n / 2 - 1) {
                idx1 = val;
            }
            if (count == n / 2) {
                idx2 = val;
            }

            count++;
        }

        // Determine the median based on the length of the combined array
        if (n % 2 == 1) {
            // If odd, return the middle element
            return idx2;
        }

        // If even, return the average of the two middle elements
        return (idx1 + idx2) / 2.0;
    }
}
