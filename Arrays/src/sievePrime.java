package Arrays.src;

public class sievePrime {
    public static void main(String[] args) {
        int n =100;
        prime(n);
    }
    public static void prime(int n){
        boolean []prime = new boolean[n+1];
        prime[0] = true;// not prime
        prime[1] = true;//not prime
        for(int i =2;i*i<=n;i++){
            if(prime[i] ==false){
                for(int j =2;i*j<prime.length;j++){
                    prime[i*j] = true;
                }
            }
        }
        for(int i =2;i<prime.length;i++){
            if(prime[i]==false){
                System.out.println(i+ " ");
            }
        }
    }
}
