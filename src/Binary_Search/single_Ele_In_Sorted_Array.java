package Binary_Search;

public class single_Ele_In_Sorted_Array {
    public static void main(String[] args) {
        int[]arr = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10};
        System.out.println(search(arr));

    }
    public static int search(int[]arr){
        int n =arr.length;
        if(n==1){
            return arr[0];
        }
        if(arr[0]!=arr[1]){
            return arr[0];
        }
        if(arr[n-1]!=arr[n-2]){
            return arr[n-1];
        }
      int s =1;
        int e =n-2;
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid]!=arr[mid+1]&&arr[mid]!=arr[mid-1]){
                return arr[mid];
            }
            else if(mid%2==1&&arr[mid]==arr[mid-1]||mid%2==0&&arr[mid]==arr[mid+1]){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return -1;
    }
}

