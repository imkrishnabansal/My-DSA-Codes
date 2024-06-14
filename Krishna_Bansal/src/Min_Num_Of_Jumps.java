package Krishna_Bansal.src;

public class Min_Num_Of_Jumps {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int n = 11;
        System.out.println(jumps(arr,n));
    }
    public static int jumps(int[] arr, int n) {
        if (n <= 1)
            return 0;

        int maxR = arr[0];
        int step = arr[0];
        int jump = 1;

        if (arr[0] == 0)
            return -1;

        for (int i = 1; i < n; i++) {
            if (i == n - 1) {
                return jump;
            }
            maxR = Math.max(maxR, i + arr[i]);
            step--;
            if (step == 0) {
                jump++;
                if (i >= maxR) {
                    return -1;
                }
                step = maxR - i;
            }
        }
        return -1;
    }
}