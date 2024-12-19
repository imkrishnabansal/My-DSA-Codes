package Arrays.src;

public class Sum_Of_Square {
    public static void main(String[] args) {
        int c =2;
        System.out.println(sum(c));
    }
    public static boolean sum(int c) {
        int i  =0;
        int j =(int)Math.sqrt(c);
        while(i<=j){
            int sum = i*i + j*j;
            if(sum==c){
                return true;
            }
            else if(sum<c){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
}
