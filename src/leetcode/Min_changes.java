package leetcode;

public class Min_changes {
    public static void main(String[] args) {
        int n =13;
        int k =4;
        System.out.println(changes(n,k));
    }
    public static int changes(int n, int k) {
        int xor = n ^ k;
        int count = 0;

        // Count the number of 1s in the binary representation of xor
        while (xor != 0) {
            count += xor & 1;
            xor >>= 1;
        }
        return count;
    }
}
