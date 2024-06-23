package Arrays;

public class Richest_wealth {
    public static void main(String[] args) {
        int[][] arr = {{1,5}, {7,3},{3,5}};
        int maxWealth = maxWealth(arr);
        System.out.println("The maximum wealth is: " + maxWealth);
    }

    public static int maxWealth(int[][] arr) {
        int maxWealth = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}
