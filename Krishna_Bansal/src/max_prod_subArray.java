package Krishna_Bansal.src;

public class max_prod_subArray {
    public static void main(String[] args) {
        int[]arr=  {-2,0,-1};
        System.out.println(maxProduct(arr));

    }
        public static  int maxProduct(int[] nums) {
            int max = nums[0], min = nums[0], ans = nums[0];
            int n = nums.length;

            for (int i = 1; i < n; i++) {

                // Swapping min and max
                if (nums[i] < 0){
                    int temp = max;
                    max = min;
                    min = temp;
                }
                max = Math.max(nums[i], max * nums[i]);
                min = Math.min(nums[i], min * nums[i]);


                ans = Math.max(ans, max);
            }
            return ans;

        }
    }

