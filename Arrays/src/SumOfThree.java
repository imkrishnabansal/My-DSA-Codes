package Arrays.src;

import java.util.Scanner;

public class SumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int testCase = 0; testCase < t; testCase++) {
            int n = sc.nextInt();
            if (n < 6) {
                System.out.println("NO");
            } else {
                boolean found = false;

                for (int x = 1; x <n - 1 && !found; x++) {
                    if (x % 3 == 0) continue;
                    for (int y = x + 1; y <n && !found; y++) {
                        if (y % 3 == 0) continue;
                        int z = n - x - y;
                        if (z > y && z % 3 != 0 && z != x && z != y) {
                            System.out.println("YES");
                            System.out.println(x + " " + y + " " + z);
                            found = true;
                        }
                    }
                }
                if (!found) {
                    // If no such triplet is found
                    System.out.println("NO");
                }
            }
        }
    }
}
