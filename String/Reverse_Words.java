package String;

public class Reverse_Words {
    public static void main(String[] args) {
        String s = "    the sky is       blue";
        System.out.println(reverse(s));

    }

    public static String reverse(String s) {
        s = s.trim();

        String[] arr = s.split("\s+");
        String ans ="";
        for (int i = arr.length-1; i>=0; i--) {
            ans = ans + arr[i]+ " ";
        }

        return ans.trim();
    }
}
