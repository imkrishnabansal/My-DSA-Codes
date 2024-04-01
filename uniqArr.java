import java.util.*;
public class uniqArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
//        int count = 0;
//        int i,j;
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (ar[i] == ar[j])
                    break;
            }
            System.out.print(ar[i++]);
        }
    }
}