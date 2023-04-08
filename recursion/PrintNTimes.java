package recursion;

public class PrintNTimes {
    public static void main(String[] args) {
        String s="Aditya Dixit"; 
        print(s, 8);   
        System.out.println("natural numbers:");
        printNaturalNum(1);
    }

    public static void print(String s,int N){
        if(N==0){
            return ;
        }
        System.out.println(s);
        print(s, N-1);
    }
    // print n natural number
    public static void printNaturalNum(int n){
        if(n==10) return;
        System.out.println(n);
        printNaturalNum(n+1);
    }

}
