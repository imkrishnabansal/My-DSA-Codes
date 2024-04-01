import java.util.*;
public class mrgeArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int union = 0;
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for(int i =0;i<n;i++) {
            arr1[i] = sc.nextInt();
        }
        for(int j = 0;j<m;j++) {
            arr2[j] = sc.nextInt();
        }
        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;j<arr2.length;j++){
            if(arr1[i]>arr2[j]) {
               i++;
            }
            else{
                j++;
            }
            }
            int arr3[] = new int[s];

        }

          }
      }
