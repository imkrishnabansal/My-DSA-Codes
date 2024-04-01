import java.util.*;
public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
            avg = sum/arr.length;
        }
            System.out.println(sum);
        System.out.println(avg);
    }
}
