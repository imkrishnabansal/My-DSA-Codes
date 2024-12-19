package Arrays.src;

public class Min_opertin_to_binary_ele_1 {
    public static void main(String[] args) {
        int[]arr = {0,1,0};
        int k =1;
        System.out.println(min_op(arr,k));

    }
    public static int min_op(int[]nums,int k){
        int n = nums.length;
        int[] flipDiff = new int[n + 1];
        int count = 0, flipCount = 0;

        for (int i = 0; i < n; i++) {
            flipCount ^= flipDiff[i]; // Current flip count considering previous flips
            if (nums[i] == flipCount) { // If the current state requires a flip
                if (i + k > n) { // Not enough space to flip k bits
                    return -1;
                }
                count++;
                flipCount ^= 1; // Flip the current state
                flipDiff[i + k] ^= 1; // Mark the end of the k-flip range
            }
        }

        return count;
    }
}
