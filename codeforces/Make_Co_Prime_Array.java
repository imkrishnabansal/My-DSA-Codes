package codeforces;
import java.util.Scanner;

public class Make_Co_Prime_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int testcase = 0; testcase < t; testcase++) {// this line is more taking no of inputs
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            // Calculate and print the number of insertions for this test case
            System.out.println(Insertions(arr));
//        }
        sc.close();
    }

    public static int Insertions(int[] arr) {
        int insert = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (gcd(arr[i], arr[i + 1]) != 1) {
                insert++;
            }
        }
        return insert;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
