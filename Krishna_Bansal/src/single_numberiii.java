package Krishna_Bansal.src;

public class single_numberiii {
    public static void main(String[] args) {
        int []nums = {1,2,1,3,2,5};
        int[] result = number(nums);
        System.out.println( result[0] + " " + result[1]);
    }
    public static int[] number(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        int lowestBit = xor & (-xor);

        int[] result = new int[2];
        for (int num : nums) {
            if ((num & lowestBit) == 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }
        return result;
    }
}
