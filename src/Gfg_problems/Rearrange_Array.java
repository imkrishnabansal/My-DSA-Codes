package Gfg_problems;
import java.util.*;
public class Rearrange_Array {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {3,1,-2,-5,-4};
        int[] ans = RearrangebySign(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
    public static int[] RearrangebySign(int[] A, int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (A[i] > 0)
                pos.add(A[i]);
            else
                neg.add(A[i]);
        }
        for (int i = 0; i < n / 2; i++) {
            A[2 * i] = pos.get(i);
            A[2 * i + 1] = neg.get(i);
        }
        return A;
    }
}
