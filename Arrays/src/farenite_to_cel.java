package Arrays.src;
import java.util.Scanner;

public class farenite_to_cel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f1 = sc.nextInt();
        int f2 = sc.nextInt();
        int f3 = sc.nextInt();
        for(int i =f1;i<=f2;i+=f3) {
            int c1 = (int)((5.0/9.0) * (i - 32));
            System.out.println(i + "   " + c1);
        }
        sc.close();
    }
}
