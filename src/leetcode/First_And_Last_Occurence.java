package leetcode;

public class First_And_Last_Occurence {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 8, 8,8, 9, 12};
        int x = 8;
        int ans = count(arr, x);
        System.out.println(ans);

    }

    public static int count(int[] arr, int x) {
        int first = findFirstOccurrence(arr, x);
        if (first == -1) {
            return 0;
        }
        int last = findLastOccurrence(arr, x);
        return (last - first + 1);
    }

    public static int findFirstOccurrence(int[] arr, int x) {
        int s = 0;
        int e = arr.length - 1;
        int result = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == x) {
                result = mid;
                e = mid - 1;
            } else if (arr[mid] < x) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return result;
    }

    public static int findLastOccurrence(int[] arr, int x) {
        int s = 0;
        int e = arr.length - 1;
        int result = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == x) {
                result = mid;
                s = mid + 1;
            } else if (arr[mid] < x) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return result;
    }
}
