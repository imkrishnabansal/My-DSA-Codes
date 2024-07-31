package Binary_Search;

public class Min_Days_To_Make_M_Bouquets {
    public static void main(String[] args) {
        int[]arr = {7, 7, 7, 17, 16, 14, 18,6};
        int k =3;
        int m =2;
        System.out.println(rosegarden(arr,k,m));

    }

    public static boolean possible(int[] arr, int day, int m, int k) {
        int c = 0;
        int noofB = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                c++;
            } else {
                noofB += (c / k);
                c = 0;
            }
        }
        noofB += c / k;
        return noofB >= m;
    }
    public static int rosegarden(int[]arr,int k ,int m){
        int val = m*k;
        int n =arr.length;
        if(val>n){
            return -1;
        }
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        int low = min, high = max;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (possible(arr, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
