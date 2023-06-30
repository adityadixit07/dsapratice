public class fibonacii {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fibRecursive(n));
        System.out.println(fibDp(n));
        System.out.println(nthFib(n));
    }

    // recursive solution
    public static int fibRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    // dp code
    public static int fibDp(int n) {
        if (n <= 1) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    // time complexity :O(n) space complexity:O(n)

    // now we optimise the space complexity in our dp code

    // otimal solution
    public static int nthFib(int n) {
        int prev1 = 0;
        int prev2 = 1;
        for (int i = 1; i <= n; i++) {
            int sum = prev1 + prev2;
            prev2 = prev1;
            prev1 = sum;
        }
        return prev1;
    }
}