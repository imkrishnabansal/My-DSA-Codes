package leetcode;

import java.util.List;
import java.util.Set;

public class Vowel_Substring {
    public static void main(String[] args) {
        String s = "leetcode";
        int k =3;
        Set<Character> vw = Set.of('a','e','i','o','u');
        int count =0;
        for(int i= 0;i<k;i++){
            count+=vw.contains(s.charAt(i))?1:0;
        }
        int ans = count;
        for(int i =k;i<s.length();i++){
            count+= vw.contains(s.charAt(i))?1:0;
            count-=vw.contains(s.charAt(i-k))?1:0;
            ans = Math.max(ans,count);
        }
        System.out.println(ans);

    }

}
