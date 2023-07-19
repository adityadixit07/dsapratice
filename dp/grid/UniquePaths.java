import java.util.Arrays;

public class UniquePaths {
    public static void main(String[] args) {
        int m = 3;
        int n = 4;
        // System.out.println(recurive(m, n)); //recursive
        System.out.println(uniquepathCounts(m, n)); // dp solution
        // System.out.println(allUniquePaths(m, n)); //space optimised
    }

    // dp solution
    public static int uniquepathCounts(int m, int n) {
        if (m == 1 && n == 1)
            return 1;
        int[][] dp = new int[m + 1][n + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        dp[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[0][0] = 1;
                }
                int left = 0;
                int up = 0;
                if (i > 0) {
                    left = dp[i - 1][j];
                }
                if (j > 0) {
                    up = dp[i][j - 1];
                }
                dp[i][j] = left + up;
            }
        }
        return dp[m - 1][n - 1];
    }

    // space optimisation
    public static int allUniquePaths(int m, int n) {
        int[] dp = new int[n];
        for (int i = 0; i < m; i++) {
            int[] curr = new int[n];
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    curr[j] = 1;
                }
                if (i > 0) {
                    curr[j] = dp[i];
                }
                if (j > 0) {
                    curr[j] = curr[j - 1];
                }

            }
            int idx = 0;
            for (int val : curr) {
                dp[idx++] = val;
            }
        }
        return dp[n - 1];
    }
    // recursive approach
    public static int recurive(int m, int n) {
        if (m == 1 && n == 1)
            return 1;
        if (m == 0 || n == 0)
            return 0;
        int up = recurive(m, n - 1);
        int left = recurive(m - 1, n);
        return up + left;
    }
}
