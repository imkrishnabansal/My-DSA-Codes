package recursion;

public class LaxicoCounting {
    public static void main(String[] args) {
        int n = 1000;
        Lc(n, 0);
    }

    public static void Lc(int n, int curr) {
        if (curr > n) {
            return;
        }
        if (curr != 0) {
            System.out.println(curr);
        }
        int i = (curr == 0) ? 1 : 0;
        for (; i <= 9; i++) {
            Lc(n, curr * 10 + i);
        }
    }
}
