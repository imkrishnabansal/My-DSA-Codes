package Two_D_Array;
import java.util.*;
public class Wave_Print {
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
        int[][]arr ={{1,2,3,4},
                { 4,5,6,7},
                { 4,5,6,7},
                { 4,5,6,7}};

        PrintWave(arr);
    }
    public static void PrintWave(int arr[][]){
        for(int col= 0;col<arr[0].length;col++){
            if(col%2==0) {
                for (int row = 0; row < arr.length; row++) {
                    System.out.print(arr[row][col] + " ");
                }
            }
            for(int row =arr.length-1;row>=0;row--){
                System.out.print(arr[row][col] + " ");
            }
        }
    }
}
