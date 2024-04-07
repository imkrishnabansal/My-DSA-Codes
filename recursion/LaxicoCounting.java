package recursion;

public class LaxicoCounting {
    public static void main(String[] args) {
        int n =1000;
        Lc(n,0);
        return;

    }
    public static void Lc(int n,int curr){
        if(curr>n){
            return;
        }
        System.out.println(curr);
        int i =0;
        if(curr==0){
            i= 1;
        }
        for(;i<=n;i++){
            Lc(n,curr*10+i);
        }
    }
}
