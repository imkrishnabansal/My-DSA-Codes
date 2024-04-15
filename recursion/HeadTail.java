package recursion;

public class HeadTail {
        public static void main(String[] args) {
            int n = 3;
            CoinToss(n,"");
        }
        public static void CoinToss(int n,String ans){
            if(n==0){
                System.out.println(ans);
                return;
            }
            CoinToss(n-1,ans + "H");
            CoinToss(n-1,ans + "T");
        }
    }

