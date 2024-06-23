package Arrays.src;

public class max_subArray {
    public static void main(String[] args) {
        int[]arr ={5,4,-1,7,8};
        System.out.println(maxSum(arr));
    }
    public static int maxSum(int[]arr){
        int ans = Integer.MIN_VALUE;
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum =sum+arr[i];
            ans = Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }

        }
        return ans;
    }


}
