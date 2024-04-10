import java.util.*;
public class commulativeSum{

    //main method
    public static void main(String[] args) {
        int sum = 0;

        int numbers[] = { 44, -5 , 9, 15, -31, -22, 19, 48 };
        int arr1[] = numbers;

        for (int i = 0; i < numbers.length; i++) {
            if (arr1[i] > 0) {
                sum += arr1[i];
                arr1[i] = sum;

                System.out.println( "The commulative sum is "+ numbers[i] + " ");
            }
        }

//        System.out.println(Arrays.toString(arr1));
    }
}