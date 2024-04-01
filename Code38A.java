import java.util.Scanner;
public class Code38A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int n = scanner.nextInt(); // number of ranks
        int[] yearsToReachNextRank = new int[n - 1]; // years to reach next rank
        for (int i = 0; i < n - 1; i++) {
            yearsToReachNextRank[i] = scanner.nextInt();
        }
        int currentRank = scanner.nextInt(); // current rank of Vasya
        int targetRank = scanner.nextInt(); // target rank

        // Calculate total years needed to reach target rank
        int totalYears = 0;
        for (int i = currentRank; i < targetRank; i++) {
            totalYears += yearsToReachNextRank[i - 1];
        }

        // Output
        System.out.println(totalYears);

        scanner.close();
    }
}