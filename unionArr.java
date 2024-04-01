import java.util.*;
public class unionArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int unionlength = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        int unionarr[] = new int[unionlength];
//        int count = 0;
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int j = 0; j < m; j++) {
            arr2[j] = sc.nextInt();
        }
//        unionarr = arr1.length + arr2.length;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] < arr2[j]) {
                    System.out.println(arr1[i++]);
                } else if (arr1[i] > arr2[j]) {
                    System.out.println(arr2[j++]);
                } else {
                    System.out.println(arr2[j++]);
                    i++;
                }
                while (arr1[i] < n) {
                    System.out.println(arr1[i++]);
                }
                while (arr2[j] < m) {
                    System.out.println(arr2[j++]);
                }
                System.out.println(arr1[i] + arr2[j] + n + m);
            }
        }
    }
}
