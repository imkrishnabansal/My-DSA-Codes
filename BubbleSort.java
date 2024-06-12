import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        int arr[] = {78,67,5,3,2,12};
        for(int i =0;i<arr.length;i++){
            for(int j= i+1;j<arr.length;j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
                System.out.print(arr[i] + " ");
        }
    }
}
//time complexity is O(n^2);
