package recursion;

public class QUICK_SORT {
    public static void main(String[] args) {
        int arr[] = {3, 89, 2, 5, 6, 8, 4};
        sort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

        public static void sort(int[]arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int idx = partitioning(arr,si,ei);
        sort(arr,si,idx-1);
        sort(arr,idx+1,ei);
    }
    public static int partitioning(int[]arr ,int si, int ei){
        int item = arr[ei];
        int idx = si;
        for(int i =si;i<ei;i++){
            if(arr[i]<item){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx++;
            }
        }
        int temp = arr[ei];
        arr[ei] = arr[idx];
        arr[idx] = temp;
        return idx;
    }
}
//time complexity  in avg and best case is O(n log n) and worst case O(n^2)
