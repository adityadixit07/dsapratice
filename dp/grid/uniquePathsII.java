public class uniquePathsII {
    public static void main(String[] args) {
        int[][] arr = { { 0, 0, 0 }, { 0, -1, 0 }, { 0, 0, 0 } };
        int n = arr.length;
        int m = arr[0].length;
        // recursive
        // System.out.println(helper(n-1,m-1,arr));

        // memoization
        // int[][] memo=new int[n][m];
        // for(int[] temp:memo){
        // Arrays.fill(temp,-1);
        // }
        // System.out.println(memoize(n-1,m-1,arr,memo));

        // dp solution
        System.out.println(totalpossibleways(arr, n, m));

    }

    public static int totalpossibleways(int[][] arr, int n, int m) {
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i >= 0 && j >= 0 && arr[i][j] == -1) {
                    dp[i][j] = 0;
                    continue;
                }
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                    continue;
                }
                int up = 0, left = 0;
                if (i > 0) {
                    up = dp[i - 1][j];
                }
                if (j > 0) {
                    left = dp[i][j - 1];
                }
                dp[i][j] = up + left;
            }
        }
        return dp[n - 1][m - 1];
    }
    // given that if any block contain -1 then it is considered as blocked path

    // recursive appraoch
    public static int helper(int i, int j, int[][] arr) {
        if (i >= 0 && j >= 0 && arr[i][j] == -1) {
            return 0;
        }
        if (i == 0 && j == 0) {
            return 1;
        }
        if (i < 0 || j < 0) {
            return 0;
        }
        // possible movements
        int up = helper(i - 1, j, arr);
        int left = helper(i, j - 1, arr);
        return up + left;
    }

    // now we memoize the recursive solution
    public static int memoize(int i, int j, int[][] arr, int[][] memo) {
        if (i >= 0 && j >= 0 && arr[i][j] == -1) {
            return 0;
        }
        if (i == 0 && j == 0) {
            return 1;
        }
        if (i < 0 || j < 0) {
            return 0;
        }
        // if we previously calculated the value then we return it
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        int up = memoize(i - 1, j, arr, memo);
        int left = memoize(i, j - 1, arr, memo);
        return memo[i][j] = up + left;
    }

}
