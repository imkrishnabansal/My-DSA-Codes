package Krishna_Bansal.src;

public class Append_char {
    public static void main(String[] args) {
        String s = "coaching";
        String t ="coding";
        System.out.println(append(s,t));

    }
    public static int append(String s,String t){
        int sIndex = 0, tIndex = 0;

        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                tIndex++;
            }
            sIndex++;
        }

        return t.length() - tIndex;
    }
}
