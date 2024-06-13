package Krishna_Bansal.src;

import org.w3c.dom.ls.LSOutput;

public class Book_allocation {
    public static void main(String[] args) {

        int[] page = {10, 20, 30, 40};
        int no = 2;
        System.out.println(Minpages(page,no));
    }
    public static int Minpages(int[]page,int no){
        int lo =0;
        int hi =0;
        for(int i =0;i<page.length;i++){
            hi =hi+page[i];
        }
        int ans =0;
        while(lo<=hi){
            int mid =(lo+hi)/2;
            if(isitpossible(page,no,mid)==true){
                ans =mid;
                hi =mid-1;
            }
            else{
                lo =mid+1;
            }
        }
        return ans;

    }
    public static boolean isitpossible(int[]page,int no,int mid){
        int s =1;
        int r= 0;
        for(int i =0;i<page.length;){
            if(r + page[i]<=mid){
                r+=page[i];
                i++;
            }
            else {
                r =0;
                s++;
            }
            if(s>no){
                return false;
            }
        }
        return true;

    }
}
