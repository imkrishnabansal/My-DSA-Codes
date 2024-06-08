package Krishna_Bansal.src;

import java.sql.SQLOutput;

public class longest_palindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(palindrome(s));
    }
    public static int palindrome(String s){
        int[] lc = new int[26];
        int[] uc = new int[26];
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch-97>=0){
                lc[ch-97]++;
            }
            else{
                uc[ch-65]++;
            }
        }
        int ans =0;
        boolean firstodd = false;
        for(int i =0;i<26;i++) {
            if (lc[i] % 2 == 0) {
                ans += lc[i];
            } else {
                if (firstodd == false) {
                    ans += lc[i];
                    firstodd = true;
                } else {
                    ans += lc[i] - 1;
                }
            }
        }

        for(int i =0;i<26;i++) {
            if (uc[i] % 2 == 0) {
                ans += uc[i];
            } else {
                if (firstodd == false) {
                    ans += uc[i];
                    firstodd = true;
                } else {
                    ans += uc[i] - 1;
                }
            }
        }
            return ans;
    }
}
