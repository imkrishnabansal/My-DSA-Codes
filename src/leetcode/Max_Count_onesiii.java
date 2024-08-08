package leetcode;

public class Max_Count_onesiii {
    public static void main(String[] args) {
        int[]arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k =2;
        System.out.println(Count(arr,k));

    }
    public static int Count(int[]arr,int k){
        int n =arr.length;
        int l =0;
        int zero = 0;
        int maxl =0;
        for(int i =0;i<n;i++){
            if(arr[i]==0){
                zero++;
            }
            while(zero>k){
                if(arr[l]==0){
                    zero--;
                }
                l++;
            }
            maxl = Math.max(maxl,i-l+1);
        }
        return maxl;
    }
}
