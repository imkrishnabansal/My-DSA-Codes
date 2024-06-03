package recursion;

import java.util.Random;

public class random_no {
    public static void main(String[] args) {
        int s =10;
        int e =100;
        Random rn= new Random();
        for(int i =0;i<10;i++){
            int item =rn.nextInt(e-s+1) + s;
            System.out.print(item + " ");
        }
    }
}
