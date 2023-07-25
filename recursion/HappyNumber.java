public class HappyNumber{
    public static void main(String[] args) {
        int n=13;
        // 1*1+3*3=10 
        // =>1*1+0*0=1 finally we get 1
        System.out.println(isHappy(n));
     }
     public static boolean isHappy(int n){
        if(n<0){
            return false;
        }
        int sum=0;
        while(n>0){
            int digit=n%10;
            n=(n/10);
            sum+=(digit*digit);
        }
        if(n==1){
            return true;
        }
        // it will stuck on infinite loop if n is between 2 to 4
        else if(n>1 && n<=4){
            return false;
        }
        return isHappy(sum);
     }
}