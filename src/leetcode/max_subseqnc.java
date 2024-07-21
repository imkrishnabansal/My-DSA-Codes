package leetcode;

import java.util.ArrayList;
import java.util.List;

public class max_subseqnc {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 1, 1, 2, 1, 2};
        int[] nums3 = {1, 3};

        System.out.println(longestValidSubsequence(nums1)); // Output: 4
        System.out.println(longestValidSubsequence(nums2)); // Output: 6
        System.out.println(longestValidSubsequence(nums3)); // Output: 2
    }

    public static int longestValidSubsequence(int[] nums) {
        int maxLength = 1;
        int currentLength = 1;
        List<Integer> longestSubsequence = new ArrayList<>();
        List<Integer> currentSubsequence = new ArrayList<>();

        longestSubsequence.add(nums[0]);
        currentSubsequence.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            int currentSumParity = (nums[i] + nums[i - 1]) % 2;
            int previousSumParity = (currentSubsequence.size() > 1) ?
                    (currentSubsequence.get(currentSubsequence.size() - 1) + currentSubsequence.get(currentSubsequence.size() - 2)) % 2 : currentSumParity;

            if (currentSumParity == previousSumParity) {
                currentLength++;
                currentSubsequence.add(nums[i]);
            } else {
                currentLength = 2; // start new subsequence with nums[i-1] and nums[i]
                currentSubsequence.clear();
                currentSubsequence.add(nums[i - 1]);
                currentSubsequence.add(nums[i]);
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                longestSubsequence.clear();
                longestSubsequence.addAll(currentSubsequence);
            }
        }

        System.out.println("Longest valid subsequence: " + longestSubsequence);
        return maxLength;
    }
}
