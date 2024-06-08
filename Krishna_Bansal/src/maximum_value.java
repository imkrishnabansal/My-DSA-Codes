package Krishna_Bansal.src;

public class maximum_value {
    public static void main(String[] args) {
        int[]arr = {3,5,6,7,8,21,1};
        System.out.println(max(arr));

    }

    public static int  max(int []arr){
        int max =Integer.MIN_VALUE;//-2^31
        for(int i =0;i<arr.length;i++){

//            if(arr[i]>max){
//                max = arr[i];
//            }
            max = Math.max(max,arr[i]);


        }
        return max;

//    public static int  max(int []arr){
//        int max =arr[0];
//        for(int i =1;i<arr.length;i++){
//
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        return max;
    }
}
