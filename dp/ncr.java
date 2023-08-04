<<<<<<< HEAD
public class ncr {
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        System.out.println(ncrCalculation(n, r));
    }

    public static int ncrCalculation(int n, int r) {
        if (r > n) {
            return 1;
        }
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == j || j == 0) {
                    dp[i][j] = 1;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }
        return dp[n][r];
    }
=======
public class ncr {
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        System.out.println(ncrCalculation(n, r));
    }

    public static int ncrCalculation(int n, int r) {
        if (r > n) {
            return 1;
        }
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == j || j == 0) {
                    dp[i][j] = 1;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }
        return dp[n][r];
    }
>>>>>>> 2d1728a29ec5f58401ab3955cd4ff5cbd503c449
}