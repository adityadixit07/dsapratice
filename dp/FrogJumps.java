import java.util.Arrays;

public class FrogJumps {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 40, 50, 60 };
        // recursive solution
        System.out.println(eneryNeededRec(arr, arr.length - 1));
        // memoization solution
        System.out.println(jump_memoized(arr));
        // dp code
        System.out.println(frog_jump_Dp(arr,arr.length));
    }
    // task :> minimum enery needed to frog to reach to the end
    // at a time he can jump one or two steps
    // enery can be calulated as |(current jump)-(prev jump)|

    // recursive approach
    public static int eneryNeededRec(int[] arr, int i) {
        if (i == 0) {
            return 0;
        }
        int left = eneryNeededRec(arr, i - 1) + Math.abs(arr[i] - arr[i - 1]);
        int right = Integer.MAX_VALUE;
        if (i > 1) {
            right = eneryNeededRec(arr, i - 2) + Math.abs(arr[i] - arr[i - 2]);
        }
        return Math.min(left, right);
    }

    // memoization
    public static int jump_memoized(int[] arr){
        int[] memo=new int[arr.length+1];
        Arrays.fill(memo,0);
        return memoization(arr,arr.length-1, memo);
    }
    public static int memoization(int[] arr,int n,int[] memo){
        if(n==0){
            return 0;
        }
        // if the result is previously calculated
        if(memo[n]!=0){
            return memo[n];
        }
        int left=memoization(arr, n-1, memo)+Math.abs(arr[n]-arr[n-1]);
        int right=Integer.MAX_VALUE;
        if(n>1){
            right=memoization(arr, n-2, memo)+Math.abs(arr[n]-arr[n-2]);
        }
        memo[n]=Math.min(left, right);
        return memo[n];
    }

    //memoization (top-down) -> dp code (bottom up)

    public static int frog_jump_Dp(int[]arr,int n){
        int[]dp=new int[n];
        Arrays.fill(dp,0);
        if(n==0){
            return 0;
        }
        dp[0]=0;
        for(int i=1;i<n;i++){
            int left=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
            int right=Integer.MAX_VALUE;
            if(i>1){
                right=dp[i-2]+Math.abs(arr[i]-arr[i-2]);
            }
            dp[i]=Math.min(left,right);
        }
        return dp[n-1];
    } 
}
