package leetcode;

public class Median_two_sorted_arr {
    public static void main(String[] args) {

    }
    public static int sortedArr(int[]arr1,int[]arr2){
        int i =0;int j =0;
        int n1 = arr1.length;
        int n2 =arr2.length;
        int n =n1+n2;
        int idx2 = n/2;
        int idx1 = idx2-1;
        int count =0;
        int idxele =-1;
        int idxele2 = -1;
        while(i<=j){
            if(i<arr1[i]&&j<arr2[j]){
                idxele =arr1[i];
                idxele2 =arr1[i];
            }
        }
    }
}
