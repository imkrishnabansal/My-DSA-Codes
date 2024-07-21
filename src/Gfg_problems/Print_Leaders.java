package Gfg_problems;
import java.util.*;
import java.util.ArrayList;
public class Print_Leaders {
    public static void main(String args[]){
        int arr[]=  {10, 22, 12, 3, 0, 15};
        ArrayList<Integer> ans= leader(arr);
        Collections.sort(ans, Collections.reverseOrder());
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
    public static ArrayList<Integer> leader(int[]arr){
        ArrayList<Integer> ans= new ArrayList<>();
        int n =arr.length;
        int max = arr[n-1];
        ans.add(arr[n-1]);
        for(int i =n-2;i>=0;i--){
            if(arr[i]>max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        return ans;
    }
}
