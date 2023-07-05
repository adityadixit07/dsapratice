public class FrogJumpwithKdistance {
    public static void main(String[] args) {
        int[] arr = { 10, 30, 40, 50, 20 };
        int k = 3;
        // recursive solution
        System.out.println(helper(arr, k, arr.length - 1));

        // dp solution
        System.out.println(minimisedCost(arr, k));
    }

    // dp apporoach
    public static int minimisedCost(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            int mincost = Integer.MAX_VALUE;
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(arr[i] - arr[i - j]);
                    mincost = Math.min(mincost, jump);
                }
            }
            dp[i] = mincost;
        }
        return dp[n - 1];
    }

    // recursive approach
    public static int helper(int[] arr, int k, int idx) {
        if (idx == 0) {
            return 0;
        }
        int mincost = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            if (idx - i >= 0) {
                int jump = helper(arr, k, idx - i) + Math.abs(arr[idx] - arr[idx - i]);
                mincost = Math.min(mincost, jump);
            }
        }
        return mincost;
    }
}
