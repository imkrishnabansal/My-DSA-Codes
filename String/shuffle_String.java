package String;

public class shuffle_String {
    public static void main(String[] args) {
        String s = "codeleet";
        int idx[] = {4,5,6,7,0,2,1,3};
        System.out.println(shuffle(s,idx));
    }
    public static String  shuffle(String s,int[]idx){
        char[]res = new char[s.length()];
        for(int i =0;i<idx.length;i++){
            res[idx[i]] = s.charAt(i);
        }
        return new String(res);

    }

}
