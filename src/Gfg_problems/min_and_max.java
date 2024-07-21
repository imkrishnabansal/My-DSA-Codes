package Gfg_problems;

public class min_and_max {
    public static void main(String[] args) {
        int[]arr = {3,2,1,600,1000};
        int[]result = min_max(arr);
        System.out.println(result[0] + " "  +result[1]);

    }
    public static int[] min_max(int[]arr){
        int min =arr[0];
        int max =arr[0];
        for(int i =0;i<arr.length;i++){

                if(arr[i]<min){
                    min =arr[i];
                }
                if(arr[i]>max){
                    max =arr[i];

            }
        }
        return new int[]{min, max};
    }
}
