package Arrays;

public class Majority_Ele {
    public static void main(String[] args) {
        int[]arr = {2,2,3,3,1,2,2,1};
        int n =arr.length;
        int c =0;
        int el =0;
        for(int i =0;i<n;i++){
            if(c==0){
                c =1;
                el =arr[i];
            }
            else if (el==arr[i]) {
                c++;
            }
            else{
                c--;
            }
        }
        int c1 =0;
        for(int i =0;i<n;i++){
            if(el==arr[i]){
                c1++;
            }
            if(c1>n/2){
                System.out.println(el);
            }
        }
        System.out.println("-1");
    }
}
