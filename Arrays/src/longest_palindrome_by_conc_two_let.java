//package Krishna_Bansal.src;
//
//public class longest_palindrome_by_conc_two_let {
//    public static int[] main(String[] args) {
//        String[] s = {"lc", "cl", "gg"};
//    }
//        public static int palindrome(String s) {
//            int[] lc = new int[26];
//            int[] uc = new int[26];
//            for (int i = 0; i < s.length(); i++) {
//                char ch = s.charAt(i);
//                if (ch - 97 >= 0) {
//                    lc[ch - 97]++;
//                } else {
//                    uc[ch - 65]++;
//                }
//            }
//            int ans =0;
//            boolean firstodd = false;
//            for(int i =0;i<26;i++){
//                for(int j =0;j<26;j++){
//                    if(i==j){
//                        if (lc[i] % 2 == 1) {
//                            ans += lc[i];
//                    }
//                        else {
//                            if (firstodd == false) {
//                                ans += lc[i];
//                                firstodd = true;
//                            } else {
//                                ans += lc[i] - 1;
//                            }
//                }
//            }
//
//      }
//}
