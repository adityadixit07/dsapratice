package subsequences;

public class CoinChange {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int target = 4;
        System.out.println(helper(arr.length - 1, arr, target)); //recursion
        System.out.println(coinChangeWays(arr, target)); //dp
    }

    // we can pick any element any time
    public static int coinChangeWays(int[] arr, int target) {
        int n = arr.length;
        int[][] dp = new int[n][target + 1];
        for (int i = 0; i < n; i++) {
            if (arr[i] % target == 0) {
                dp[i][0] = 1;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= target; j++) {
                int nottake = dp[i - 1][j];
                int take = 0;
                if (arr[i] <= j) {
                    take = 1 + dp[i][j - arr[i]];
                }
                dp[i][j] = nottake + take;
            }
        }
        return dp[n - 1][target];
    }

    public static int helper(int index, int[] arr, int target) {
        if (index == 0) {
            if (arr[index] == target) {
                return 1;
            } else {
                return 0;
            }
        }
        int nottake = helper(index - 1, arr, target);
        int take = 0;
        if (arr[index] <= target) {
            take = 1 + helper(index, arr, target - arr[index]);
        }
        return take + nottake;
    }
}
