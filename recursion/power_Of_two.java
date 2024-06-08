package recursion;

public class power_Of_two {
    public static void main(String[] args) {
        int n = 16;
        boolean result = isPowerOfTwo(n);
        System.out.println(result);
    }
        public static  boolean isPowerOfTwo (int n){
            if (n == 1) {
                return true;
            }
            if (n < 1 || n % 2 != 0) {
                return false;
            }
            return isPowerOfTwo(n / 2);
        }
    }

