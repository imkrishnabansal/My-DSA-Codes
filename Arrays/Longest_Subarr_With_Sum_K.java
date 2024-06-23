package Arrays;

public class Longest_Subarr_With_Sum_K {
    public static void main(String[] args) {
        int k = 3;
        int[]arr = {1,2,3,4,5,2,1,3,4,1,1,1,2,3};
        subArray(arr,k);
    }
    public static void subArray(int[]arr,int k){
        for(int i =0;i<arr.length;i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
            }

                if (sum == k) {
                    System.out.println(sum);
                }
            }
        }
    }