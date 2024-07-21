package leetcode;
import java.util.*;
public class Find_Lucky_Number {
    public static void main(String[] args) {
        int matrix[][] = {{3,7,8},{9,11,13},{15,16,17}};
        int n = matrix.length;
        int m = matrix[0].length;
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i =0;i<n;i++){
            int max = Integer.MAX_VALUE;
            int idx =-1;
            for(int j =0;j<m;j++){
                if(matrix[i][j]<max){
                    max =matrix[i][j];
                    idx =j;
                }
            }
            boolean flag =true;
            for(int r= 0;r<n;r++){
                if(matrix[r][idx]>max){
                    flag =false;
                }
            }
            if(flag){
                ls.add(max);
            }
        }
        System.out.println(ls);
    }
}