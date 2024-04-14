package recursion;
import javax.swing.plaf.IconUIResource;
import java.util.*;
public class Math_path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int totalCount = countAndPrintPath(0, 0, n - 1, m - 1, "");
        System.out.println();
        System.out.println(totalCount);
    }

    static int countAndPrintPath(int cc, int cr, int ec, int er, String ans) {
        if (cc == ec && cr == er) {
            System.out.print(ans+" "); // Print the path
            return 1; // Return 1 since we found a valid path
        }

        if (cc > ec || cr > er) {
            return 0; // Return 0 if we go out of bounds
        }

        int count = 0;
        count += countAndPrintPath(cc, cr + 1, ec, er, ans + "V") ;// Move vertically
        count += countAndPrintPath(cc + 1, cr, ec, er, ans + "H"); // Move horizontally
        count += countAndPrintPath(cc + 1, cr + 1, ec, er, ans + "D"); // Move diagonally

        return count; // Return the total count of paths
    }
}
