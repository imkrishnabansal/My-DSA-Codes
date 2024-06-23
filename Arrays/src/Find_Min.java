package Arrays.src;

public class Find_Min {
    public static void main(String[] args) {
        int[]arr = {3,6,9};
        System.out.println(min(arr));

    }
    public static int min(int[]arr){
        int sum =0;
        int count  =0;
        for(int i =0;i<arr.length;i++) {
            int rem = arr[i] % 3;
            if (rem == 1 || rem == 2) {
                sum = sum + 1;
                count++;
            }
        }
        return count;
    }
}
