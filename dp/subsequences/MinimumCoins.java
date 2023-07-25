package subsequences;

public class MinimumCoins {
    public static void main(String[] args) {
        int[] coins = { 1, 2, 3, 3 };
        int target = 7;
        System.out.println(helper(coins.length - 1, target, coins)); // recursive approach
        System.out.println(minCoins(coins, target));//tabulation
    }

    // there is infinite supply of coins means we can pick same coin any number of
    // times
    public static int minCoins(int[] coins, int target) {
        int[][] dp = new int[coins.length][target + 1];
        // handle base case
        for (int j = 1; j <= target; j++) {
            if(j%coins[0]==0){
                dp[0][j]=j/coins[0];
            }
            else{
                dp[0][j]=Integer.MAX_VALUE;
            }
        }
        for(int i=1;i<coins.length;i++){
            for(int j=1;j<=target;j++){
                int notPick=0+dp[i-1][j];
                int pick=Integer.MAX_VALUE;
                if(coins[i]<=j){
                    pick=1+dp[i][j-coins[i]];
                }
                dp[i][j]=Math.min(pick,notPick);
            }
        }
        return dp[coins.length-1][target];
    }

    public static int helper(int index, int target, int[] coins) {
        if (index == 0) {
            if (target % coins[index] == 0) {
                return target / coins[index];
            } else {
                return 0;
            }
        }
        int notTake = 0 + helper(index - 1, target, coins);
        int take = Integer.MAX_VALUE;
        if (coins[index] <= target) {
            take = 1 + helper(index, target - coins[index], coins);
        }
        return Math.min(notTake, take);
    }
    // afer recursive code we can easily memoize it
}
