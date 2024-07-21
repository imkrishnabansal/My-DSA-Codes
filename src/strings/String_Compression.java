package strings;

public class String_Compression {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c','d','d'};
        int compressedLength = compress(chars);
        System.out.println(compressedLength);
    }
    public static int compress(char[] chars) {
        int n = chars.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < n) {
            int j = i;
            while (j < n && chars[j] == chars[i]) {
                j++;
            }
            sb.append(chars[i]);
            int count = j - i;
            if (count > 1) {
                sb.append(count);
            }
            i = j;
        }
        for (i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}
