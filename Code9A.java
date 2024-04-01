import java.util.Scanner;

public class Code9A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int y = scanner.nextInt();
        int w = scanner.nextInt();

        int maxRoll = Math.max(y, w);
        int favorableOutcomes = 6 - maxRoll + 1;

        if (y == w) {
            System.out.println(favorableOutcomes + "/" + 6);
        } else {
            int gcd = gcd(favorableOutcomes, 6);
            System.out.println(favorableOutcomes / gcd + "/" + 6 / gcd);
        }

        scanner.close();
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
