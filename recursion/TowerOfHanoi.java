package recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter number of discs");
        int n=sc.nextInt();
        System.out.println("tower 1:");
        int from=sc.nextInt();
        System.out.println("tower 2:");
        int to=sc.nextInt();
        System.out.println("tower 3:");
        int where=sc.nextInt();
        System.out.println(HOI(n, from, to, where));
    }
    public static int HOI(int n,int from,int to,int where){
        if(n==0){
            return 0;
        }
        int l=HOI(n-1, from, where, to);
        System.out.println("Move disk "+n+" from rod "+from+" to rod "+to);
        int r=HOI(n-1, where, to, from);
        return l+r+1;
    }
}
