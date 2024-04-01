import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {89,90,54,3,24,3};
        for(int i = 0;i<arr.length-1;i++){
            int min =i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                   min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
//?tie comlexity is O(n^2)
