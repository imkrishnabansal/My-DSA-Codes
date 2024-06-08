package Krishna_Bansal.src;

public class single_Number {
    public static void main(String[] args) {
       int []nums = {4,1,2,1,2};
        System.out.println(number(nums));
    }
    public static int number(int []nums){
        int idx =0;
        for(int i =0;i<nums.length;i++){
            idx = idx^nums[i];
        }
        return idx;
    }
}
