package Arrays.src;
import java.util.*;
public class chewbacco_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans =0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
           int res =9-i;
            ans = Math.min(res,i);
        }
        System.out.println(ans);
    }
}
