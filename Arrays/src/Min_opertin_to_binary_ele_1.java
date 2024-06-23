package Arrays.src;

public class Min_opertin_to_binary_ele_1 {
    public static void main(String[] args) {
        int[]arr = {1,0,0,0};
        System.out.println(min_op(arr));

    }
    public static int min_op(int[]arr){
        int count =0;
            for(int i =0;i<arr.length-2;i++) {
                if(arr[i]==0){
                    arr[i] = 1-arr[i];
                    arr[i+1] = 1-arr[i+1];
                    arr[i+2] = 1-arr[i+2];
                    count++;
                }

            }
            for(int i =0;i<arr.length;i++){
                if(arr[i]==0){
                    return -1;
                }
            }
            return  count;
    }
}
