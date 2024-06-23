package Arrays;

import java.util.Arrays;

public class F_And_L_pos_Of_ele {
    public static void main(String[] args) {
        int[]arr = {5,7,8,7,8,10};
        int target =8;
        System.out.println(Arrays.toString(findEle(arr,target)));
    }
    public static int[]  findEle(int[]arr,int target) {
        int[] result = {-1, -1};
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                result[0] = mid;
                e = mid - 1;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid -1;
            }
        }
         s = 0;
         e = arr.length - 1;
        while (s <= e) {
            int mid = s+ (e -s) / 2;
            if (arr[mid] == target) {
                result[1] = mid;
                s = mid + 1;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return result;
    }
}
