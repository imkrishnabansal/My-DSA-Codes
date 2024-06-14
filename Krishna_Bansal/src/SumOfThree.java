package Krishna_Bansal.src;

import java.util.Scanner;

public class SumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a scanner object to read input from the console
        int t = sc.nextInt(); // Read the number of test cases

        // Loop through each test case
        for (int testCase = 0; testCase < t; testCase++) {
            int n = sc.nextInt(); // Read the integer n for the current test case

            if (n < 6) {
                // If n is less than 6, it's impossible to find such a triplet
                System.out.println("NO");
            } else {
                // We need to find x, y, and z such that x + y + z = n
                // and none of x, y, z is divisible by 3
                boolean found = false;

                // Try some combinations of x, y, and z
                for (int x = 1; x <n - 1 && !found; x++) {
                    if (x % 3 == 0) continue; // Skip x if it's divisible by 3
                    for (int y = x + 1; y <n && !found; y++) {
                        if (y % 3 == 0) continue; // Skip y if it's divisible by 3
                        int z = n - x - y; // Compute z
                        if (z > y && z % 3 != 0 && z != x && z != y) { // z must be distinct and not divisible by 3
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

        sc.close(); // Close the scanner
    }
}
