package recursion;

public class Factorial {
    public static void main(String[] args) {
        int n=7;
        System.out.println(fact(n));
        System.out.println("power of number:"+findPow(2, 3));
        System.out.println("power of number in logn :"+pow(2, 3));
    }
    public static int fact(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    // power of a any number
    public static int findPow(int x,int n){
        if(n==0){
            return 1;
        }
        return x*findPow(x, n-1);
    }
    // power of number in logrithmic time complexity
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        int xn=pow(x,n/2)*pow(x, n/2);
        if(n%2==1){
            return xn*x;
        }
        else{
            return xn;
        }
    }
}
