package Arrays.src;

public class Third_Max_Arr {
    public static void main(String[] args) {
        int []arr = {3,2,1};
        System.out.println(array(arr));
    }
    public static int array(int[]arr){
        for(int i =0;i<arr.length-1;i++){
            for(int j =i+1;j<arr.length-1;j++) {
                int temp =arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
                i++;
                j--;
            }
            System.out.println(arr[i+1]);
        }
        return 0;
    }
}
