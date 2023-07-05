public class ClimbingStairs {
    public static void main(String[] args) {
        int stairs=3;
        System.out.println(totalWays(stairs));
        System.out.println(climbStairs(stairs));
    }
    // at a time we can jump 1 stair or 2 stairs 
    // task :> total ways to reat to the top

    // recursive  solution to get all possible ways
    public static int totalWays(int n){
        if(n<=2){
            return n;
        }
        int one_step=totalWays(n-1);
        int two_steps=totalWays(n-2);
        return one_step+two_steps;
    }

    // dp code to optimise the time complexity
    public static int climbStairs(int n){
        if(n<=2){
            return n;
        }
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
