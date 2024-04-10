package recursion;

public class Math_path {
    public static void main(String[] args) {
        int n = 3;
        int m =3;
        printPath(0,0,n-1,m-1,"");
    }
    static void printPath(int cc,int cr,int ec,int er,String ans){
        if(cc==ec&&cr==er){
            System.out.println(ans);
            return;
        }
        if(cc>ec||cr>er) {
            return;
        }
            printPath(cc + 1, cr, ec, er, ans + "H");
            printPath(cc, cr + 1, ec, er, ans + "V");

        }
}
