package leetcode;

public class Max_Operations {
    public static void main(String[] args) {
        String s = "00111";
        System.out.println(operations(s));
    }

    public static int operations(String s) {
        int operations = 0;
        char[] str = s.toCharArray();
        int n = str.length;

        // Start from the leftmost character and move right
        for (int i = 0; i < n - 1; i++) {
            // If we find a '1' followed by '0'
            if (str[i] == '1' && str[i + 1] == '0') {
                // Move this '1' to the rightmost possible position
                for (int j = i + 1; j < n; j++) {
                    if (str[j] == '1') {
                        break;  // Stop if we encounter another '1'
                    }
                    if (j == n - 1 || str[j + 1] == '1') {
                        // Move the '1' to the current position j
                        str[i] = '0';
                        str[j] = '1';
                        operations++;
                        break;
                    }
                }
            }
        }

        return operations;
    }
}