package leetcode;

public class Max_Height_of_A_Triangle {
    public static void main(String[] args) {
        System.out.println(height(2, 4)); // Output: 3
        System.out.println(height(2, 1)); // Output: 2
        System.out.println(height(1, 1)); // Output: 1
        System.out.println(height(10, 1)); // Output: 2
    }

    public static int height(int red, int blue) {
        int h = 0;
        boolean useRed = true;

        while (true) {
            h++;
            if (useRed) {
                if (red >= h) {
                    red -= h;
                } else {
                    break;
                }
            } else {
                if (blue >= h) {
                    blue -= h;
                } else {
                    break;
                }
            }
            useRed = !useRed;
        }

        return h - 1;
    }
}
