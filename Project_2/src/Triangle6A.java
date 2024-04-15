import java.util.Arrays;
import java.util.Scanner;

public class Triangle6A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the lengths of the sticks
        int[] lengths = new int[4];
        for (int i = 0; i < 4; i++) {
            lengths[i] = scanner.nextInt();
        }

        // Sort the lengths in non-decreasing order
        Arrays.sort(lengths);

        // Check if it's possible to construct a non-degenerate triangle
        if (lengths[0] + lengths[1] > lengths[2] || lengths[1] + lengths[2] > lengths[3]) {
            System.out.println("TRIANGLE");
        }
        // Check if it's possible to construct a degenerate triangle
        else if (lengths[0] + lengths[1] == lengths[2] || lengths[1] + lengths[2] == lengths[3]) {
            System.out.println("SEGMENT");
        }
        // Otherwise, it's impossible to construct any triangle
        else {
            System.out.println("IMPOSSIBLE");
        }

        scanner.close();
    }
}