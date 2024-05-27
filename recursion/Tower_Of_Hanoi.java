package recursion;

public class Tower_Of_Hanoi {
    public static void main(String[] args) {
        int n =3;
        TOH(n,"s","d","h");
    }
    public static void TOH(int n,String src,String help,String dest){
        if(n==0){
            return;
        }
        TOH(n-1,src,dest,help);
        System.out.println("transfer " + n + " from " + src +" to " + dest);
        TOH(n-1,help,src,dest);

    }
}
