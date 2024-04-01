import java.util.*;
public class rotateArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int i = 0; i < k; i++){
            int first = arr[0] ,j;
            for( j =0;j<arr.length-1;j++){
                arr[j] = arr[j+1];
            }
            arr[j] = first;
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
