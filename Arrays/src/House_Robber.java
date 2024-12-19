package Arrays.src;

public class House_Robber {
    public static void main(String[] args) {
        int[]arr = {2,1,1,2};
        System.out.println(house(arr));
    }
    public static int house(int[]arr){
        if (arr.length == 0) return 0;
        if (arr.length == 1) return arr[0];
        if(arr.length==2) return Math.max(arr[0],arr[1]);
        int prev1 = 0; // max money robbed up to the previous house
        int prev2 = 0; // max money robbed up to the house before the previous house

        for (int num : arr) {
            int temp = prev1;
            prev1 = Math.max(prev2 + num, prev1);
            prev2 = temp;
        }

        return prev1;
    }
}
