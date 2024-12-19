package recursion;

public class targetsum {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(targetSum(nums, target, 0, 0));
    }

    public static int targetSum(int[] nums, int target, int idx, int currSum) {
        if (idx == nums.length) {
            return currSum == target ? 1 : 0;
        }

        int positive = targetSum(nums, target, idx + 1, currSum + nums[idx]);
        int negative = targetSum(nums, target, idx + 1, currSum - nums[idx]);

        return positive + negative;
    }
}
