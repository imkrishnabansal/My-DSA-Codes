package leetcode;

public class Best_tym_to_buy_and_sell_Stock {
    public static void main(String[] args) {
        int[]arr = {5,2,8,6,4,1};
        System.out.println(max_profit(arr));

    }
    public static int max_profit(int[]arr){
        int max =0;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<min){
                min =arr[i];
            }
            int profit = arr[i]-min;
            if(profit>max){
                max =profit;
            }
        }
        return max;
    }
}
