import java.util.*;
public class transposearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[][] ={ {3,4,5} ,{5,6,7} , {7,8,9}};
        int transposeArr[][] = new int[3][3];
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++) {
                transposeArr[i][j] = arr1[j][i];
            }
        }
        for(int i =0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[j][i] + " ");
            }
            System.out.println();
        }
        }
    }

