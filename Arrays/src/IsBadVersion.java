package Arrays.src;

public class IsBadVersion {
    public static void main(String[] args) {
        int n =5;
    }
    public static int badversion(int n) {
        int low = 1;
        int high = n;
        int ans = 0;
        while (low <= high) {
            int mid = low+(high - low) / 2;//helps in overflow
            if (isBadVersion(mid) == true) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
            return ans;
        }

            public static boolean isBadVersion(int mid){
return false;

        }
    }

