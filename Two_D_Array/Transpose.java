package Two_D_Array;

public class Transpose {
    public static void main(String[] args) {
        int[][]arr = {{2,3,4,5},{5,6,7,8},{7,8,9,0},{3,4,2,1}};
        tranpose(arr);
        for(int i =0;i<arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            }
    }
    public static void tranpose(int[][]arr){
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr[0].length;j++){
                int temp =arr[i][j];
                arr[i][j] =arr[j][i];
                arr[j][i] =temp;

            }
        }

    }
}
