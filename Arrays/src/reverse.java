package Arrays.src;

public class reverse {
    public static void main(String[] args) {
        int[] arr = {7, 8, 5, 4, 3,34,21,2,1,4,5,67,6,4,3,2,5,7,53,6,4,3};
        reverse(arr,3,12);
//        System.out.println(reverse(arr));
//        System.out.println(reverse(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int[] arr,int i,int j) {
//        i = 0;
//         j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}