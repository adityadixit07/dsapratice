package Arrays;

import java.util.Arrays;

public class UniquePathinGrid {
    
    static int[][] dp;
    public static void main(String[] args) {
        int[][] grid = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        System.out.println(countWays(grid));
    }

    // You start at the upper-left corner of the grid (1, 1) and you have to reach
    // the bottom-right corner (n, m) such that you can only move in the right or
    // down direction from every cell.
    

    public static int countWays(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        dp = new int[row][col];
        for (int[] val : dp) {
            Arrays.fill(val, -1);
        }
        return dfs(0, 0, row, col, grid);
    }

    public static int dfs(int i, int j, int row, int col, int[][] grid) {
        if (i < 0 || j < 0 || i >= row || j >= col || grid[i][j] == 0) {
            return 0;
        }
        if (i == row - 1 && col == -1) {
            return 1;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int down = dfs(i + 1, j, row, col, grid);
        int right = dfs(i, j + 1, row, col, grid);
        dp[i][j] = down + right;
        return dp[i][j];
    }

}