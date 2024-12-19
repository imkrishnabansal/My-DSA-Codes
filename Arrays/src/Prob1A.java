package Arrays.src;
import java.util.*;
public class Prob1A {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input the dimensions of the square and size of flagstones
            long n = scanner.nextLong(); // width
            long m = scanner.nextLong(); // length
            long a = scanner.nextLong(); // size of flagstone

            // Calculate the number of flagstones needed for width and length
            long widthFlagstones = (long) Math.ceil((double) n / a);
            long lengthFlagstones = (long) Math.ceil((double) m / a);

            // Calculate the total number of flagstones needed
            long totalFlagstones = widthFlagstones * lengthFlagstones;

            System.out.println(totalFlagstones);

            scanner.close();
        }
    }
