package recursion;

public class HeadTail_2 {
    public static void main(String[] args) {
        int n = 3;
        CoinToss_2(n,"");
//        System.out.println(count);
//        System.out.println(CountCoinToss_2(n,""));
    }
//    static int count =0;
    public static void CoinToss_2(int n,String ans){
        if(n==0){
            System.out.println(ans);
//            count++;
            return;
        }
        if(ans.length()==0|| ans.charAt(ans.length()-1)!='H') {
            CoinToss_2(n - 1, ans + "H");
        }
        CoinToss_2(n-1,ans + "T");
    }
//    public static int CountCoinToss_2(int n,String ans){
//        if(n==0){
//            System.out.println(ans);
//            count++;
//            return 1;
//        }
//        int a1;
//        int a2;
//        if(ans.length()==0|| ans.charAt(ans.length()-1)!='H') {
//           a1= CountCoinToss_2(n - 1, ans + "H");
//        }
//       a2 = CountCoinToss_2(n-1,ans + "T");
//        return a1+a2;
//    }
}
