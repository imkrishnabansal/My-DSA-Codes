import java.util.*;
public class BinarySerch
{
    static void binarySearch(int arr[],int key)
    {
        int s=0,mid;
        int e=arr.length-1;
        int flag=0;
        while(s<=e)
        {
            mid=(s+e)/2;
            if(arr[mid]==key)
            {
                flag=1;
                break;
            }
            if(arr[mid]>key)

                e=mid-1;

            else
                s=mid+1;
        }
        if(flag==1)
            System.out.println("Yes found ");
        else
            System.out.println("Not found");
    }
    public static void main(String[] args) {
        int[] arr={22,44,55,66,66,77,88};
        int k=90;
        binarySearch(arr,k);
    }
}
//TIME COMPLEXITY IS O(log n)
