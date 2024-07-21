package leetcode;

public class Move_Zeroes {
    public static void main(String[] args) {
        int[]nums = {1,0,3,0,12};
        zeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public static void zeroes(int[]nums){
        int n =nums.length;
        int nonzero =0;
        for(int i =0;i<n;i++){
            if(nums[i]!=0){
                nums[nonzero] = nums[i];
                nonzero++;
            }
        }
        for(int i =nonzero;i<n;i++){
            nums[i] =0;
        }
    }
}
