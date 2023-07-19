public class minPathSum {
    public static void main(String[] args) {
        int[][] grid = { { 5, 9, 6 }, { 11, 5, 2 } };
        int n = grid.length;

        // recursive solution
        System.out.println(helper(n - 1, grid[0].length - 1, grid));

        // dynamic prgromming solution
        System.out.println(minCostToReachBottom(grid, n, grid[0].length));
    }

    // cost is asscociated with each grid[i][j] we have to find the min cost to
    // reach
    // from top left corenet to bottom right corner
    public static int minCostToReachBottom(int[][] grid, int n, int m) {
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = grid[i][j];
                } else {
                    int up = grid[i][j];

                    if (i > 0) {
                        up += dp[i - 1][j];
                    } else {
                        up += (int) Math.pow(10, 9);
                    }
                    int left = grid[i][j];
                    if (j > 0) {
                        left += dp[i][j - 1];
                    } else {
                        left += (int) Math.pow(10, 9);
                    }
                    dp[i][j] = Math.min(up, left);
                }
            }
        }
        return dp[n - 1][m - 1];
    }

    // recursion
    public static int helper(int i, int j, int[][] grid) {
        if (i == 0 && j == 0) {
            return grid[i][j];
        }
        if (i < 0 || j < 0) {
            return (int) Math.pow(10, 9);
        }
        int up = grid[i][j] + helper(i - 1, j, grid);
        int left = grid[i][j] + helper(i, j - 1, grid);
        return Math.min(up, left);
    }
}
