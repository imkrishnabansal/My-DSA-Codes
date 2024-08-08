package Binary_Search;

public class least_Capacity {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,9,10};
        int days =5;
        System.out.println(capacity(arr,days));

    }
    public static int capacity(int[]arr,int days){
        int low =getMax(arr);
        int high =getSum(arr);
        while(low<high){
            int mid = low + (high-low)/2;
           int noOfDay = findDays(arr,mid);
           if(noOfDay<=days) {
               high = mid - 1;
           }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    public static int findDays(int[] arr, int cap) {
        int days = 1;
        int load = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + load > cap) {
                days += 1;
                load = arr[i];
            } else {
                load += arr[i];
            }
        }
        return days;
    }

    public static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return  max;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}

