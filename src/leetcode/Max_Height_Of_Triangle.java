package leetcode;

public class Max_Height_Of_Triangle {
    public static void main(String[] args) {
        int blue =4;
        int red =2;
        System.out.println(height(red,blue));

    }
    public static int height(int red,int blue){
        int count =0;
        while(blue>0||red>0){
            if(blue%2==0&&red%2!=0||blue%2!=0&&red%2==0){
                count++;
            }
            else if(blue%2==0&&red%2==0){
                count++;
            }
            else{
                count =0;
            }
        }
        return count;
    }
}
